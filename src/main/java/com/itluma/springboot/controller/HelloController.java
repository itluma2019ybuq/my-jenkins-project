package com.itluma.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 飞鸟
 * @create 2020-02-19 15:52
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello World!";
    }
}
