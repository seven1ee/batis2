package lll.config;

//spring和数据库连接相关的配置

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;


//Bean
    //作用:把当前方法的返回值作为Bean对象存入spring的ioc容器中
    //属性:name指定bean的id（不写时默认是方法名）
    //细节:当我们使用注解配置时，如果方法有参数，spring去容器中查找有没有可用的bean对象，查找的方式和Auto注解的作用是一样的

public class JdbcConfig
{

    @Value("${jdbc.Driver}")
    private  String driver;
    @Value("${jdbc.url}")
    private  String url;
    @Value("${jdbc.username}")
    private  String username;
    @Value("${jdbc.password}")
    private  String password;


    //配置QueryRunner
    //todo

    @Bean(name="runner")
    @Scope("prototype")  //修改成单例
    public QueryRunner createQueryRunner(@Qualifier("ds1") DataSource dataSource){  //Qualifier和AutoWired一样
        return new QueryRunner(dataSource);
    }

    @Bean(name="ds1")  //配置数据源
    public DataSource createDataSource(){
        try {
            ComboPooledDataSource ds = new ComboPooledDataSource();
            ds.setDriverClass(driver);
            ds.setJdbcUrl(url);
            ds.setUser(username);
            ds.setPassword(password);
            return ds;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Bean(name="ds2")  //配置数据源
    public DataSource createDataSource2(){
        try {
            ComboPooledDataSource ds = new ComboPooledDataSource();
            ds.setDriverClass(driver);
            ds.setJdbcUrl("jdbc:mysql://localhost:3306/xx");
            ds.setUser(username);
            ds.setPassword(password);
            return ds;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
