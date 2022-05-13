package com.common.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mopan.
 * @date 2021/12/9.
 */

@RestController
public class TestController {

    @RequestMapping("/test/common")
    public String getTest(){
        System.out.println("hello world common!");
        return "hello world common!";
    }

}
