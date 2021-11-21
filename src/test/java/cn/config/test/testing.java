package cn.config.test;

import cn.loc.IocJavaConfig;
import cn.loc.beans.Person;
import cn.loc.beans.Role;
import cn.loc.beans.User;
import cn.loc.controller.UserController;
import com.alibaba.druid.pool.DruidDataSource;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class testing {

    AnnotationConfigApplicationContext ioc;
    @Before
    public void before(){
        ioc =new AnnotationConfigApplicationContext(IocJavaConfig.class);
    }

    @Test
    public void test01(){
//        加载spring上下文

        UserController bean=ioc.getBean(UserController.class);
        bean.getUser();
    }

    @Test
    public void test02(){
        DruidDataSource bean=(DruidDataSource) ioc.getBean("dataSource");
        System.out.println(bean);
    }

    @Test
    public void test03(){
        User bean=(User) ioc.getBean("user2");
        System.out.println(bean);
    }

    @Test
    public void test04(){
        Role bean=ioc.getBean(Role.class);
        System.out.println(bean);
    }

    @Test
    public void test05(){
        Person bean=ioc.getBean(Person.class);
        System.out.println(bean);
    }
}
