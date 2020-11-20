package com.demo.search.repository;

import com.demo.search.pojo.Goods;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author jensen
 * @date 2016/9/22
 */
public interface GoodsRepository extends ElasticsearchRepository<Goods, Long> {
}
