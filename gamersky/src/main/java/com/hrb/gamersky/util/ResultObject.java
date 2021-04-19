package com.hrb.gamersky.util;


import com.hrb.gamersky.enums.ResultEnum;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author wanghaoji
 * @date 2021/04/18
 * @apiNote 统一的返回结果类
 */

@Data
public class ResultObject<T> {

    @ApiModelProperty(
            value = "状态码",
            example = "200"
    )
    private Integer code;

    @ApiModelProperty(
            value = "错误信息",
            example = "操作成功"
    )
    private String message;

    @ApiModelProperty(
            value = "返回数据"
    )
    private T data;

    /**
     * 给有返回数据的方法使用
     * @param resultEnum
     * @param data
     */
    public ResultObject(ResultEnum resultEnum, T data) {
        this.code = resultEnum.getCode();
        this.message = resultEnum.getMessage();
        this.data = data;
    }

    /**
     * 给没有返回数据的方法使用
     * @param resultEnum
     */
    public ResultObject(ResultEnum resultEnum) {
        this.code = resultEnum.getCode();
        this.message =resultEnum.getMessage();
    }

}
