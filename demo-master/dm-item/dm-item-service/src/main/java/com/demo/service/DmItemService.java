package com.demo.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author jensen
 * @date 2016/9/13
 */
@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.demo.service.mapper")
public class DmItemService {

    public static void main(String[] args) {
        SpringApplication.run(DmItemService.class);
    }
}
