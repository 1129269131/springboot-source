package com.koala.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * day01
 * 测试：
 *      浏览器访问：http://localhost:8080/hi
 * Create by koala on 2021-07-31
 */
@RestController
public class HelloController01 {

    @GetMapping("/hi")
    public String hello(){
        return "Hi, Boot!";
    }

}
