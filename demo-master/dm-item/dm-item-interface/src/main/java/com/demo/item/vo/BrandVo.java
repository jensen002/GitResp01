package com.demo.item.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author jensen
 * @date 2016/9/17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BrandVo {

    private Long id;
    private String name;
    private String image;
    private List<Long> cids;
    private Character letter;
}
