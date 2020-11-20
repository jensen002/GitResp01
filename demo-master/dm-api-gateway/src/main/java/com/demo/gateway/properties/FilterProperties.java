package com.demo.gateway.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

/**
 * @author jensen
 * @date 2016/10/2
 */
@Data
@ConfigurationProperties(prefix = "dm.filter")
public class FilterProperties {

    private List<String> allowPaths;


}
