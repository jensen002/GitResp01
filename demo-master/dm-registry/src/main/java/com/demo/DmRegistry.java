package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author jensen
 * @date 2016/9/13
 */
@SpringBootApplication
@EnableEurekaServer
public class DmRegistry {

    public static void main(String[] args) {
        SpringApplication.run(DmRegistry.class);
    }
}
