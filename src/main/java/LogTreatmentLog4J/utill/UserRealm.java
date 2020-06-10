package LogTreatmentLog4J.utill;

import LogTreatmentLog4J.cemvc.Serivce.UserSerivce;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;

/**
* 自定义Realm
 *
* */
public class UserRealm extends AuthorizingRealm {
/**
 * 执行授权逻辑
 *
 * */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        System.out.println("执行授权逻辑");
        //给资源进行授权
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();

        //到数据库查询单签登录用户的授权字符串
        //获取当前登录用户
        Subject subject= SecurityUtils.getSubject();
        //是下面那user给的
        User user= (User) subject.getPrincipal();
      //  User dbUser=userSerivce.findbyId(user.getUserId());
        //添加资源的授权字符串
        info.addStringPermission(user.getAuthSou());




        //添加资源的授权字符串
       // info.addStringPermission("user:add");


        return info;
    }
    @Autowired
    private UserSerivce userSerivce;
    /**
     * 执行登录验证逻辑
     *
     * */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken org) throws AuthenticationException {
        System.out.println("执行登录验证逻辑");
      /*  //假设数据库的用户名和密码
        String name = "123";
        String password = "123";*/
        //查询数据库


        //编写shiro判断逻辑，判断用户名和密码
        //1.判断用户名
        UsernamePasswordToken token=(UsernamePasswordToken)org;
        System.out.println(token.getPassword());
        User user= userSerivce.selectUserPass(token.getUsername());

        if(user==null){
            //用户名不存在
            return null;//shiro底层会抛出UnKnowAccountException
        }
        //2.判断密码
        return new SimpleAuthenticationInfo(user,user.getUserPassword(),"");



     /*   if (!token.getUsername().equals(name)){
            //用户名不存在
            System.out.println("Username不存在");
            return null;//shiro底层会抛出UnKnowAccountException

        }
        //2.判断密码
        return new SimpleAuthenticationInfo("",password,"");*/


    }
}
