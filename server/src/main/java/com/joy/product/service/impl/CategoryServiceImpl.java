package com.joy.product.service.impl;

import com.joy.product.dataobject.ProductCategory;
import com.joy.product.repository.ProductCategoryRepository;
import com.joy.product.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Ai Lun on 2019-07-23.
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    ProductCategoryRepository productCategoryRepository;

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {

        return productCategoryRepository.findByCategoryTypeIn(categoryTypeList);

    }
}
