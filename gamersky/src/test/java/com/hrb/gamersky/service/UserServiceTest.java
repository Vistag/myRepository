package com.hrb.gamersky.service;

import com.hrb.gamersky.entity.pojo.UserBean;
import com.hrb.gamersky.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {
    @Autowired
    UserServie userServie;

    @Test
    public void addOneTest() {
        UserBean userBean = new UserBean();
        userBean.setUserName("王静海");
        userBean.setUserPassword("1714010320");
        userBean.setUserStatus(1);


        System.err.println(userBean);

        userServie.addUser(userBean);
    }

    @Test
    public void queryAllTest() {
        List<UserBean> userBeans = userServie.queryAllUser();

        for (UserBean u:
             userBeans) {
            System.err.println(u);
        }
    }
}
