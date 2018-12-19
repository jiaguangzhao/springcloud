package com.example.hystrix.controller;

import com.example.hystrix.service.HystrixService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Jiaguangzhao
 * @date: 2018-12-19 18:34
 */
@RestController
@Slf4j
public class HystrixController {

    @Autowired
    HystrixService hystrixService;

    @GetMapping("/hello/{name}")
    public String getHello(@PathVariable String name){
        log.info("啦啦啦 ................");
        return hystrixService.getHello(name);
    }
}
