package com.joy.product.common;

import lombok.Data;

/**
 * Created by Ai Lun on 2019-07-29.
 */
@Data
public class DecreaseStockInput {

    /**
     * 商品 id
     */
    private String productId;

    /**
     * 商品数量
     */
    private Integer productQuantity;

    public DecreaseStockInput() {
    }

    public DecreaseStockInput(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }

}
