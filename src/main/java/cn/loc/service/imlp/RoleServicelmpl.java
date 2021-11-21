package cn.loc.service.imlp;

import cn.loc.beans.Role;
import cn.loc.dao.UserDao;
import cn.loc.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;

public class RoleServicelmpl implements RoleService{

    @Autowired
    UserDao userDao;

    public void getBean(){
        userDao.getUser();
    }
}
