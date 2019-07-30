package com.joy.product.service;

import com.joy.product.common.DecreaseStockInput;
import com.joy.product.common.ProductInfoOutput;
import com.joy.product.dataobject.ProductInfo;

import java.util.List;

/**
 * Created by Ai Lun on 2019-07-23.
 */
public interface ProductService {

    /**
     * 查询所有在架商品列表
     */
    List<ProductInfo> findUpAll();

    /**
     * 查询指定 id 的商品列表 （id 入参为列表）
     */
    List<ProductInfoOutput> findList(List<String> productIdList);

    /**
     * 扣库存
     * @param decreaseStockInputList
     */
    void decreaseStock(List<DecreaseStockInput> decreaseStockInputList);
}
