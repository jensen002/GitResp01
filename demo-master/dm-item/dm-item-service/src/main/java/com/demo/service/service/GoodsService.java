package com.demo.service.service;

import com.demo.common.vo.PageResult;
import com.demo.item.dto.CartDto;
import com.demo.item.pojo.Sku;
import com.demo.item.pojo.Spu;
import com.demo.item.pojo.SpuDetail;

import java.util.List;

/**
 * @author jensen
 * @date 2016/9/18
 */
public interface GoodsService {
    PageResult<Spu> querySpuByPage(Integer page, Integer rows, String key, Boolean saleable);

    SpuDetail querySpuDetailBySpuId(Long spuId);

    List<Sku> querySkuBySpuId(Long spuId);

    void deleteGoodsBySpuId(Long spuId);

    void addGoods(Spu spu);

    void updateGoods(Spu spu);

    void handleSaleable(Spu spu);

    Spu querySpuBySpuId(Long spuId);

    List<Sku> querySkusByIds(List<Long> ids);

    void decreaseStock(List<CartDto> cartDtos);
}
