package com.joy.product.VO;

import lombok.Data;

/**
 * Created by Ai Lun on 2019-07-23.
 */
@Data
public class ResultVO<T> {

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 提示信息
     */
    private String msg;

    /**
     * 具体内容
     */
    private T data;
}
