package cn.loc.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class User {

//    使用 @Value()设置依赖注入的属性
//            1.除了可以写硬编码的值
//            2.还可以写${}、#{}
//    @Value("吴彦祖")
    @Value("#{role.name}")
//    @Value("${mysql.name}")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public User(){
//        System.out.println("User已加载");
//    }
}
