package com.hrb.gamersky.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hrb.gamersky.entity.pojo.UserBean;
import org.springframework.stereotype.Repository;

/**
 * 用户的mapper接口
 * @author wanghaoji
 * @date 2021/04/18
 */

@Repository
public interface UserMapper extends BaseMapper<UserBean> {

}
