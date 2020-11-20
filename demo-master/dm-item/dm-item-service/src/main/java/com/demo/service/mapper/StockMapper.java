package com.demo.service.mapper;

import com.demo.common.mapper.BaseMapper;
import com.demo.item.pojo.Stock;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

/**
 * @author jensen
 * @date 2016/9/18
 */
public interface StockMapper extends BaseMapper<Stock, Long> {

    @Update("update tb_stock set stock = stock - #{num} where sku_id = #{skuId} and stock >= #{num}")
    int decreaseStock(@Param("skuId") Long skuId, @Param("num") Integer num);
}
