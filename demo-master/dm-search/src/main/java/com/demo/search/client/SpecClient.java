package com.demo.search.client;

import com.demo.item.api.SpecApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author jensen
 * @date 2016/9/22
 */
@FeignClient("item-service")
public interface SpecClient extends SpecApi {
}
