package com.demo.gateway.properties;

import com.demo.auth.utils.RsaUtils;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;

import javax.annotation.PostConstruct;
import java.io.File;
import java.security.PublicKey;

/**
 * @author jensen
 * @date 2016/10/2
 */

@ConfigurationProperties(prefix = "dm.jwt")
@Data
@Slf4j
public class JwtProperties {

    private String pubKeyPath;
    private PublicKey publicKey;
    private String cookieName;

    @PostConstruct
    public void init() {
        try {
            //获取公钥
            publicKey = RsaUtils.getPublicKey(pubKeyPath);
        } catch (Exception e) {
            log.error("初始化公钥失败", e);
            throw new RuntimeException();
        }

    }
}
