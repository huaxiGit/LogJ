package LogTreatmentLog4J.config.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.LinkedHashSet;

@Configuration
@EnableSwagger2//开启swagger2的自动配置 http://localhost:10004/swagger-ui.html#/
@ComponentScan("LogTreatmentLog4J.cemvc.Controller")
public class AwaggerConfig {
    /**通过合并/覆盖用户指定的值来构建Docket。
     *
     * 配置如何通过path过滤,即这里只扫描请求以/kuang开头的接口
     * .paths(PathSelectors.ant("/kuang/**"))
     *
     5、这里的可选值还有
     any() // 任何请求都扫描
     none() // 任何请求都不扫描
     regex(final String pathRegex) // 通过正则表达式控制
     ant(final String antPattern) // 通过ant()控制
     *
     *
     * .enable(false) //配置是否启用Swagger，如果是false，在浏览器将无法访问
     * */
/*
* Swagger注解	简单说明
@Api(tags = “xxx模块说明”)	作用在模块类上
@ApiOperation(“xxx接口说明”)	作用在接口方法上
@ApiModel(“xxxPOJO说明”)	作用在模型类上：如VO、BO
@ApiModelProperty(value = “xxx属性说明”,hidden = true)	作用在类方法和属性上，hidden设置为true可以隐藏该属性
@ApiParam(“xxx参数说明”)	作用在参数、方法和字段上，类似@ApiModelProperty


* */

    //配置docket以配置swagger具体参数

    @Bean
    public Docket docket(Environment environment) {
        //如何动态配置当项目处于test、dev环境时显示swagger，处于prod时不显示
        // 设置要显示swagger的环境
        Profiles of = Profiles.of("dev", "test");
        // 判断当前是否处于该环境
        // 通过 enable() 接收此参数判断是否要显示
        boolean b = environment.acceptsProfiles(of);

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("hello") // 配置分组
                .enable(true) //配置是否启用Swagger，如果是false，在浏览器将无法访问
                .select()// 通过.select()方法，去配置扫描接口,RequestHandlerSelectors配置如何扫描接口
                .apis(RequestHandlerSelectors.basePackage("LogTreatmentLog4J.cemvc.Controller"))

                .build();
    }

    //配置文档信息
//配置文档信息
    //配置了Swagger信息=apiInfo
    private ApiInfo apiInfo(){

        Contact contact = new Contact("一叶孤舟","https://www.csdn.net/","517394441@qq.com");

        return new ApiInfo(
                "一叶孤舟的SwaggerAPI文档",
                "你要悄悄拔尖，然后惊艳所有人",
                "v1.0",
                "urn:tos",
                contact,
                "Apache 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0",
                new ArrayList());
    }




}
