package com.joy.product.service;

import com.joy.product.dto.CartDTO;
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
    List<ProductInfo> findList(List<String> productIdList);

    /**
     * 扣库存
     * @param cartDTOList
     */
    void decreaseStock(List<CartDTO> cartDTOList);
}
