package com.joy.product.controller;

import com.joy.product.VO.ProductVO;
import com.joy.product.VO.ResultVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.transform.Result;

/**
 * 商品
 * Created by Ai Lun on 2019-07-22.
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    /**
     * 1. 查询所有在架的商品
     * 2. 获取类目 type 列表
     * 3. 查询类目
     * 4. 构造数据
     */
    @GetMapping("/list")
    public ResultVO<ProductVO> list() {
        return null;
    }
}
