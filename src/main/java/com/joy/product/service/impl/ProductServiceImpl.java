package com.joy.product.service.impl;

import com.joy.product.dataobject.ProductInfo;
import com.joy.product.enums.ProductStatusEnum;
import com.joy.product.repository.ProductInfoRepository;
import com.joy.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Ai Lun on 2019-07-23.
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Override
    public List<ProductInfo> findUpAll() {
        return productInfoRepository.findByProductStatus(ProductStatusEnum.UP.getCode());
    }

}
