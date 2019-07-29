package com.joy.product.utils;

import com.joy.product.VO.ResultVO;

import javax.xml.transform.Result;

/**
 * Created by Ai Lun on 2019-07-23.
 */
public class ResultVOUtil {

    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setData(object);
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        return resultVO;
    }

}
