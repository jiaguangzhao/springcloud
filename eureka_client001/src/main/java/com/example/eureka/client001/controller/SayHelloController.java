package com.example.eureka.client001.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Jiaguangzhao
 * @date: 2018-12-19 15:01
 */
@RestController
@Slf4j
public class SayHelloController {

    @GetMapping(value = "/hello/{name}")
    public String sayHello(@PathVariable("name") String name){
        log.info("name：{} say Hello ！！！", name);
        return "Hello, ".concat(name).concat("!");
    }
}