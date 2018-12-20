package com.example.gateway.configuration;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.*;

/**
 * @author: Jiaguangzhao
 * @date: 2018-12-19 20:18
 */
@Configuration
public class GatewayConfiguration {

    @Bean
    public RouterFunction<ServerResponse> responseRouterFunction(){
        RouterFunction<ServerResponse> route = RouterFunctions.route(RequestPredicates.path("/testfun"),
                request -> ServerResponse.ok().body(BodyInserters.fromObject("hello")));
        return route;
    }

    @Bean
    public RouteLocator routeLocator(RouteLocatorBuilder builder){
        return builder.routes()
                .route(route ->
                        route.host("**.abc.org")
                                .and().path("/image/png")
                                .filters(filter -> filter.addResponseHeader("X-TestHeader", "footbar"))
                                .uri("http://httpbin.org:80"))
                .route(route ->
                        route.path("/image/webp")
                                .filters(filter -> filter.addResponseHeader("X-AnotherHeader", "abc"))
                                .uri("http://httpbin.org:80"))
                .build();

    }
}