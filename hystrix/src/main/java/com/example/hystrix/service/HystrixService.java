package com.example.hystrix.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author: Jiaguangzhao
 * @date: 2018-12-19 18:41
 */
@Service
@Slf4j
public class HystrixService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "getHelloFallBack")
    public String getHello(String name){
        return restTemplate.getForEntity("http://EUREKA-CLIENT/hello/{name}", String.class, name).getBody();
    }

    private String getHelloFallBack(String name) {
        log.info("不能获取实例，返回默认!!!!");
        return "default value Hello !!!!!";
    }
}