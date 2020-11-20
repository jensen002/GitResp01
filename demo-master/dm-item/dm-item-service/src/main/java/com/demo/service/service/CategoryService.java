package com.demo.service.service;

import com.demo.item.pojo.Category;

import java.util.List;

/**
 * @author jensen
 * @date 2016/9/15
 */
public interface CategoryService {


    List<Category> queryCategoryByPid(Long pid);

    List<Category> queryCategoryByIds(List<Long> ids);

    List<Category> queryAllByCid3(Long id);
}
