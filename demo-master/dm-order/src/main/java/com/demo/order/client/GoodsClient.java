package com.demo.order.client;

import com.demo.item.api.GoodsApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author jensen
 * @date 2016/10/4
 */
@FeignClient(value = "item-service")
public interface GoodsClient extends GoodsApi {
}
