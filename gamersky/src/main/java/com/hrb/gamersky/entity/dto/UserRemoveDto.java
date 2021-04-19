package com.hrb.gamersky.entity.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

/**
 * @author wanghaoji
 * @date 2021/04/19
 * @apiNote user存储对象
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRemoveDto {

    @ApiModelProperty("用户id")
    @NotNull
    private Long userId;

}
