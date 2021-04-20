package com.hrb.gamersky.controller;

import com.hrb.gamersky.entity.dto.UserSaveDto;
import com.hrb.gamersky.entity.pojo.UserBean;
import com.hrb.gamersky.enums.ResultEnum;
import com.hrb.gamersky.service.UserServie;
import com.hrb.gamersky.util.ResultObject;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wanghaoji
 * @date 2021/04/18
 */

@RestController
@RequestMapping("/user")
@Api(value = "用户模块", tags = "用户管理接口")
@Slf4j
@Scope("prototype")
public class UserController {

    @Autowired
    UserServie userServie;

    //abdon of this
    public ResultObject addOneUser(UserSaveDto userSaveDto) {
        userServie.addUser(userSaveDto);
        return new ResultObject(ResultEnum.SUCCESS);
    }

}
