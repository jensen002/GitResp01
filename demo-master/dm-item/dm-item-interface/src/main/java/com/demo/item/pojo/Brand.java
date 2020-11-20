package com.demo.item.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author jensen
 * @date 2016/9/15
 */
@Table(name = "tb_brand")
@Data
public class Brand {

    @Id
    @KeySql(useGeneratedKeys = true)
    private Long id;
    private String name;
    private String image;
    private Character letter;
}
