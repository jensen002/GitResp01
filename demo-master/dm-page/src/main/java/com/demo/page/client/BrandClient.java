package com.demo.page.client;

import com.demo.item.api.BrandApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author jensen
 * @date 2016/9/22
 */
@FeignClient("item-service")
public interface BrandClient extends BrandApi {
}
