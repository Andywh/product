package com.joy.product.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.joy.product.dataobject.ProductInfo;
import lombok.Data;

import java.util.List;

/**
 * Created by Ai Lun on 2019-07-23.
 */
@Data
public class ProductVO {

    @JsonProperty("name")
    private String categoryName;

    @JsonProperty("type")
    private Integer categoryType;

    @JsonProperty("foods")
    List<ProductInfoVO> productInfoVOList;

}
