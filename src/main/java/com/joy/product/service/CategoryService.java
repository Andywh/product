package com.joy.product.service;

import com.joy.product.dataobject.ProductCategory;

import java.util.List;

/**
 * 类目
 * Created by Ai Lun on 2019-07-23.
 */
public interface CategoryService {

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

}
