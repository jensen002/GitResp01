package com.demo.item.api;

import com.demo.item.pojo.Brand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author jensen
 * @date 2016/9/22
 */
public interface BrandApi {

    @GetMapping("brand/{id}")
    Brand queryById(@PathVariable("id") Long id);

    @GetMapping("brand/list")
    List<Brand> queryBrandsByIds(@RequestParam("ids") List<Long> ids);
}
