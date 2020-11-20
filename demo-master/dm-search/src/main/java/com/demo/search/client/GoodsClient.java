package com.demo.search.client;

import com.demo.item.api.GoodsApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author jensen
 * @date 2016/9/22
 */
@FeignClient(value = "item-service")
public interface GoodsClient extends GoodsApi {
}
