package com.hrb.gamersky.service.Impl;

import com.hrb.gamersky.entity.dto.UserRemoveDto;
import com.hrb.gamersky.entity.dto.UserSaveDto;
import com.hrb.gamersky.entity.pojo.UserBean;
import com.hrb.gamersky.mapper.UserMapper;
import com.hrb.gamersky.service.UserServie;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wanghaoji
 * @date 2021/04/18
 */

@Service
public class UserServiceImpl implements UserServie {

    @Autowired
    UserMapper userMapper;

    @Override
    public void addUser(UserSaveDto userSaveDto) {
        //1.新建数据库链接对象 UserBean
        UserBean userBean = new UserBean();

        //2.装配UserBean对象
        userBean.setUserName(userSaveDto.getName());
        userBean.setUserNickName(userSaveDto.getNickName());

    }

    @Override
    public List<UserBean> queryAllUser() {
        List<UserBean> userBeans = new ArrayList();
        userBeans = userMapper.selectList(null);


        return userBeans;
    }

    @Override
    public Long removeOneUser(UserRemoveDto userRemoveDto) {
        userMapper.deleteById(userRemoveDto.getUserId());

        return userRemoveDto.getUserId();
    }

}
