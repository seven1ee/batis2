package lll.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;


//spring 全注解配置
//扫包:ComponenScan作用：指定spring创建容器时要扫的包
    //属性 :value  和basePackages一样
    //等价于xml中配置<context:component-scan base-package="lll"> </context:component-scan>


//@ComponentScan(basePackages = "lll")
//@ComponentScan({"lll"})
@ComponentScan("lll")  //只有一个basePackages时使用""
@Import(JdbcConfig.class)
@PropertySource("classpath:jdbcConfig.properties")
public class SpringConfiguration {

}
