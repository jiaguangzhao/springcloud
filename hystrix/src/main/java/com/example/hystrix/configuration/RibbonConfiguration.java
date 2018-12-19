package com.example.hystrix.configuration;

import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.PingUrl;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;

/**
 * @author: Jiaguangzhao
 * @date: 2018-12-19 19:26
 */
public class RibbonConfiguration {

    @Bean
    public IPing ping(){
        return new PingUrl();
    }

    @Bean
    public IRule rule(){
        return new RandomRule();
    }
}
