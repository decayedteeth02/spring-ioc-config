package cn.loc;

import cn.loc.beans.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class SecondJavaConfig {
    @Bean
    public User user2(){
        return new User();
    }
}
