package com.demo.service.service;

import com.demo.common.vo.PageResult;
import com.demo.item.pojo.Brand;
import com.demo.item.pojo.Category;
import com.demo.item.vo.BrandVo;

import java.util.List;

/**
 * @author jensen
 * @date 2016/9/15
 */
public interface BrandService {

    PageResult<Brand> queryBrandByPageAndSort(Integer page, Integer rows, String sortBy, Boolean desc, String key);

    void saveBrand(Brand brand, List<Long> cids);

    List<Category> queryCategoryByBid(Long bid);

    void updateBrand(BrandVo brandVo);

    void deleteBrand(Long bid);

    List<Brand> queryBrandByCid(Long cid);

    Brand queryBrandByBid(Long id);

    List<Brand> queryBrandByIds(List<Long> ids);

}
