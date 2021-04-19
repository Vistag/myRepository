package com.hrb.gamersky.service;

import com.hrb.gamersky.entity.dto.UserRemoveDto;
import com.hrb.gamersky.entity.dto.UserSaveDto;
import com.hrb.gamersky.entity.pojo.UserBean;

import java.util.List;

/**
 * 用户服务
 * @author wanghaoji
 * @data 2021/04/18
 */
public interface UserServie {

    /**
     * 添加一个用户
     * @param userSaveDto
     */
    void addUser(UserSaveDto userSaveDto);

    /**
     * 查询所有用户
     */
    List<UserBean> queryAllUser();

    /**
     * 删除一个用户
     */
    Long removeOneUser(UserRemoveDto userRemoveDto);
}
