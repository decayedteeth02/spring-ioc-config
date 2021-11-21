package cn.loc.controller;

import cn.loc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {


//    使用@Autowired自动注入
//    默认优先根据类型去匹配
//    如果匹配到多个类型按照名字匹配
//    如果没有匹配到名字就会报错
//    1.可以修改属性对应的bean名字：userServiceImpl
//    2.可以去修改bean的名字对应的属性的名字，@Service("userService")
//    3.可以通过@Qualifier设置属性的名字（覆盖）
//    @Qualifier ("userServiceImpl“）
//    4.设置@Primary 设置其中的一个Bean为主要的自动注入Bean

//    @Autowired
    UserService userService;

    @Autowired
    public void creatUserService(UserService userService){
        this.userService=userService;
    }


    public void getUser(){
        userService.getBean();
      }

    @Override
    public String toString() {
        return "UserController{}";
    }
}
