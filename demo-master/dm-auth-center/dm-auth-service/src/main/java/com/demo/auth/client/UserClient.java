package com.demo.auth.client;

import api.UserApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author jensen
 * @date 2016/10/1
 */
@FeignClient(value = "user-service")
public interface UserClient extends UserApi {
}
