package lll.config;


import org.springframework.context.annotation.ComponentScan;


//spring 全注解配置
//扫包:ComponenScan作用：指定spring创建容器时要扫的包
    //属性 :value  和basePackages一样
    //等价于xml中配置<context:component-scan base-package="lll"> </context:component-scan>


//@ComponentScan(basePackages = "lll")
//@ComponentScan({"lll"})
@ComponentScan("lll")               //只有一个
public class SpringConfiguration {


}
