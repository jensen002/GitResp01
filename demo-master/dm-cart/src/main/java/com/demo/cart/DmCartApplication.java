package com.demo.cart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author jensen
 * @date 2016/10/3
 */
@SpringBootApplication
@EnableDiscoveryClient
public class DmCartApplication {

    public static void main(String[] args) {
        SpringApplication.run(DmCartApplication.class, args);
    }
}
