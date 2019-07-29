package com.joy.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Ai Lun on 2019-07-26.
 */
@RestController
public class ServerController {

    @GetMapping("/msg")
    public String msg() {
        return "this is product message 2";
    }

}
