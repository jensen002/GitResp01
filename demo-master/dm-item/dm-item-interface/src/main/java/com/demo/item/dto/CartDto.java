package com.demo.item.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author jensen
 * @date 2016/10/4
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartDto {

    private Long skuId;  //商品skuId

    private Integer num;  //购买数量
}
