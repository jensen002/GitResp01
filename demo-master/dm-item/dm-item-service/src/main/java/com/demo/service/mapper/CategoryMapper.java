package com.demo.service.mapper;

import com.demo.item.pojo.Category;
import tk.mybatis.mapper.additional.idlist.IdListMapper;
import tk.mybatis.mapper.common.Mapper;

/**
 * @author jensen
 * @date 2016/9/15
 */
public interface CategoryMapper extends Mapper<Category>, IdListMapper<Category, Long> {
}
