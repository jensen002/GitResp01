package com.demo.auth.service;

import com.demo.auth.client.UserClient;
import com.demo.auth.entity.UserInfo;
import com.demo.auth.properties.JwtProperties;
import com.demo.auth.utils.JwtUtils;
import com.demo.common.enums.ExceptionEnum;
import com.demo.common.exception.DmException;
import com.demo.user.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;

/**
 * @author jensen
 * @date 2016/10/1
 */
@Slf4j
@Service
@EnableConfigurationProperties(JwtProperties.class)
public class AuthService {

    @Autowired
    private UserClient userClient;

    @Autowired
    private JwtProperties props;


    public String login(String username, String password) {
        try {
            User user = userClient.queryUser(username, password);
            if (user == null) {
                return null;
            }
            UserInfo userInfo = new UserInfo(user.getId(), user.getUsername());
            //生成Token
            String token = JwtUtils.generateToken(userInfo, props.getPrivateKey(), props.getExpire());
            return token;
        } catch (Exception e) {
            log.error("【授权中心】用户名和密码错误，用户名：{}", username,e);
            throw new DmException(ExceptionEnum.USERNAME_OR_PASSWORD_ERROR);
        }
    }
}
