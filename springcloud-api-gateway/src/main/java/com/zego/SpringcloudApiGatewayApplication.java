package com.zego;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class SpringcloudApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudApiGatewayApplication.class, args);
    }

}
