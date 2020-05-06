package com.maple.mybatis.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author maplecops
 * @version 1.0
 * @date 2020/5/6 15:25
 */
@RestController
public class IndexController {

    @GetMapping("/")
    public String home() {
        return "Hello World";
    }

}
