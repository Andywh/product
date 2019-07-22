package com.joy.product.service;

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

}
