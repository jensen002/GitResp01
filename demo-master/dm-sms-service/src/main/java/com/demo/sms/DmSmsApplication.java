package com.demo.sms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author jensen
 * @date 2016/9/29
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class DmSmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(DmSmsApplication.class);
    }
}
