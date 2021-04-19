package com.hrb.gamersky.entity.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;


/**
 * @author wanghaoji
 * @date 2021/04/18
 */

@Data
@EqualsAndHashCode(callSuper = false)
@TableName("user")
@ApiModel(value = "user对象", description = "")
public class UserBean {

    @ApiModelProperty(value = "用户编号")
    @TableId(value = "user_id", type = IdType.AUTO)
    private Long userId;

    @ApiModelProperty(value = "用户名")
    @TableField("user_name")
    private String userName;

    @ApiModelProperty(value = "用户昵称")
    @TableField("user_nickname")
    private String userNickName;

    @ApiModelProperty(value = "密码")
    @TableField("user_password")
    private String userPassword;

    @ApiModelProperty(value = "邮箱")
    @TableField("user_email")
    private String userEmail;

    @ApiModelProperty(value = "用户头像")
    @TableField("user_skin")
    private String userSkin;

    @ApiModelProperty(value = "性别")
    @TableField("user_gender")
    private char userGender;

    @ApiModelProperty(value = "个性签名")
    @TableField("user_note")
    private String userNote;

    @ApiModelProperty(value = "用户状态")
    @TableField("user_status")
    private int userStatus;

    @ApiModelProperty(value = "用户等级")
    @TableField("user_level")
    private int userLevel;

    @ApiModelProperty(value = "用户经验值")
    @TableField("user_experience")
    private int userExperience;

    @ApiModelProperty(value = "删除标志")
    @TableField("delete_flag")
    private int deleteFlag;
}
