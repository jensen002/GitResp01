package com.demo.sms.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author jensen
 * @date 2016/9/29
 */
@Data
@ConfigurationProperties(prefix = "dm.sms")
public class SmsProperties {

    String accessKeyId;

    String accessKeySecret;

    String signName;

    String verifyCodeTemplate;
}
