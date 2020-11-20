package com.demo.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author jensen
 * @date 2016/9/29
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan(value = "com.demo.user.mapper")
public class DmUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(DmUserApplication.class);
    }
}
