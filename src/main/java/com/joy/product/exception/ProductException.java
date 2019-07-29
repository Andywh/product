package com.joy.product.exception;

import com.joy.product.enums.ResultEnum;

/**
 * Created by Ai Lun on 2019-07-28.
 */
public class ProductException extends RuntimeException {

    private Integer code;

    public ProductException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public ProductException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }


}
