package cn.loc;

import cn.loc.beans.MyImportSelector;
import cn.loc.beans.Role;
import cn.loc.beans.User;
import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

//相当于xml文件
@Configuration
@ComponentScan("cn.loc")
//引用PropertySource外部文件
@PropertySource("classpath:db.properties")

//@Import引入其他的配置类（@Import(SecondJavaConfig.class)）
//@Import(Role.class) 将类型注册为Bean
//导入ImportSelect实现类
@Import(MyImportSelector.class)

public class IocJavaConfig {

    @Value("${mysql.name}")
    private String name;
    @Value("${mysql.password}")
    private String password;
    @Value("${mysql.url}")
    private String url;
    @Value("${mysql.driverClassName}")
    private String driverClassName;

//    可以将一个类的实例注册为Bean
//    会自动返回Bean的类型，将方法名作为bean的id
//    @Bean(name = "")设置bean的id及别名（替换）
//    @Bean(initMethod = "",destroyMethod = "")
    public DruidDataSource dataSource(Role role){
        DruidDataSource dataSource=new DruidDataSource();
        dataSource.setName(name);
        dataSource.setPassword(password);
        dataSource.setUrl(url);
        dataSource.setDriverClassName(driverClassName);
        System.out.println(user3());

        return dataSource;
    }
//    调用第三方类（数据库）

    @Bean
    public Role role(){
        return new Role();
    }
    @Bean
    public User user3(){
        return new User();
    }

}
