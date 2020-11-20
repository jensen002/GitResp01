package com.demo.upload.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author jensen
 * @date 2016/9/16
 */
@Data
@ConfigurationProperties(prefix = "dm.upload")
@Component
public class UploadProperties {

    private String baseUrl;
    private List<String> allowTypes;
}
