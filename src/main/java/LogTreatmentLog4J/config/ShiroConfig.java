package LogTreatmentLog4J.config;

import LogTreatmentLog4J.utill.UserRealm;
import com.fasterxml.jackson.annotation.JsonBackReference;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * shior核心api
 *
 * Subject： 用户主体（把操作交给SecurityManager）
 * SecurityManager：安全管理器（关联Realm）
 * Realm：Shiro连接数据的桥梁
 * */
@Configuration
public class ShiroConfig {

    // 创建ShiroFilterFactoryBean
    @Bean
    public  ShiroFilterFactoryBean getShiroFilterFactoryBean(@Qualifier("securityManager") DefaultWebSecurityManager  securityManager){
        ShiroFilterFactoryBean shiroFilterFactoryBean=new ShiroFilterFactoryBean();
        //设置安全器
        shiroFilterFactoryBean.setSecurityManager(securityManager);
        //配置拦截器
        //添加Shiro内置过滤器
        /**
         * Shiro内置过滤器，可以实现权限相关的拦截器
         *    常用的过滤器：
         *       anon: 无需认证（登录）可以访问
         *       authc: 必须认证才可以访问
         *       user: 如果使用rememberMe的功能可以直接访问
         *       perms： 该资源必须得到资源权限才可以访问
         *       role: 该资源必须得到角色权限才可以访问
         */
        //LinhedHashMap为了保证顺序
        Map<String,String> filterMap =new LinkedHashMap<String,String>();

       //我先关闭

       // filterMap.put("/user/test","anon");
      //  filterMap.put("/user/login","anon");

        //授权过滤器必须反正拦截器上面否则无效
        // 注意：当前授权拦截后，shiro会自动跳转到未授权页面
       // filterMap.put("/user/add", "perms[user:add]");

       // filterMap.put("/user/*","authc");

        //被拦截都跳转这
        //shiroFilterFactoryBean.setLoginUrl("/user/toLogin");
        //设置未授权提示页面
      //  shiroFilterFactoryBean.setUnauthorizedUrl("/user/noAuth");


        //拦截
        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterMap);



        return shiroFilterFactoryBean;


    }

    //创建DefaultWebSecurityManager
    @Bean("securityManager")
    public DefaultWebSecurityManager getDefaultWebSecurityManager(@Qualifier("userRealm")UserRealm userRealm){
        DefaultWebSecurityManager DefaultWebSecurityManager=new DefaultWebSecurityManager();
        DefaultWebSecurityManager.setRealm(userRealm);
        return DefaultWebSecurityManager;

    }

    //创建Realm
    @Bean("userRealm")
    public UserRealm Realem(){
        return new UserRealm();
    }

}
