package com.demo.search.client;

import com.demo.item.pojo.Category;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;


/**
 * @author jensen
 * @date 2016/9/22
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryClientTest {

    @Autowired
   private CategoryClient categoryClient;

    @Test
    public void testQueryCategory() {
        List<Category> list = categoryClient.queryByIds(Arrays.asList(1L, 2L, 3L));
        list.forEach(System.out::println);
    }

}