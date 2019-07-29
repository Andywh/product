package com.joy.product.repository;

import com.joy.product.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private com.joy.product.repository.ProductCategoryRepository productCategoryRepository;

    @Test
    public void findByCategoryTypeInTest() throws Exception {
        List<ProductCategory> list = productCategoryRepository.findByCategoryTypeIn(Arrays.asList(1, 2));
        Assert.assertTrue(list.size() > 0);
    }

    @Test
    public void findAllTest() throws Exception {
        List<ProductCategory> list = productCategoryRepository.findAll();
        Assert.assertTrue(list.size() > 0);
    }


}
