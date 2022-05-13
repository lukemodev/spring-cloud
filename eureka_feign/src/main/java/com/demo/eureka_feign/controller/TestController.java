package com.demo.eureka_feign.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mopan.
 * @date 2021/12/9.
 */

@RestController
public class TestController {

    @RequestMapping("/test/eureka_feign")
    public String getTest(){

        return "hello world feign!";
    }

}
