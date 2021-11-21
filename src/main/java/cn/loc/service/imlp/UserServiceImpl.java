package cn.loc.service.imlp;

import cn.loc.beans.User;
import cn.loc.dao.UserDao;
import cn.loc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary //设置自动注入的主要bean
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    public void getBean(){
        System.out.println("User");
        userDao.getUser();

    }
}
