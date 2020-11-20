package com.demo.service.service.impl;

import com.demo.common.enums.ExceptionEnum;
import com.demo.common.exception.DmException;
import com.demo.item.pojo.Category;
import com.demo.service.mapper.CategoryMapper;
import com.demo.service.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author jensen
 * @date 2016/9/15
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;


    @Override
    public List<Category> queryCategoryByPid(Long pid) {
        Category category = new Category();
        category.setParentId(pid);
        List<Category> categoryList = categoryMapper.select(category);
        if (CollectionUtils.isEmpty(categoryList)) {
            throw new DmException(ExceptionEnum.CATEGORY_NOT_FOUND);
        }
        return categoryList;
    }

    @Override
    public List<Category> queryCategoryByIds(List<Long> ids) {
        return categoryMapper.selectByIdList(ids);

    }

    @Override
    public List<Category> queryAllByCid3(Long id) {
        Category c3 = categoryMapper.selectByPrimaryKey(id);
        Category c2 = categoryMapper.selectByPrimaryKey(c3.getParentId());
        Category c1 = categoryMapper.selectByPrimaryKey(c2.getParentId());
        List<Category> list = Arrays.asList(c1, c2, c3);
        if (CollectionUtils.isEmpty(list)) {
            throw new DmException(ExceptionEnum.CATEGORY_NOT_FOUND);
        }
        return list;
    }
}
