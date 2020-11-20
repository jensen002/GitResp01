package com.demo.search.web;

import com.demo.common.vo.PageResult;
import com.demo.search.pojo.Goods;
import com.demo.search.pojo.SearchRequest;
import com.demo.search.pojo.SearchResult;
import com.demo.search.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jensen
 * @date 2016/9/22
 */
@RestController
public class GoodsSearchController {

    @Autowired
    private SearchService searchService;

    @PostMapping("page")
    public ResponseEntity<SearchResult<Goods>> search(@RequestBody SearchRequest searchRequest) {
        return ResponseEntity.ok(searchService.search(searchRequest));
    }
}
