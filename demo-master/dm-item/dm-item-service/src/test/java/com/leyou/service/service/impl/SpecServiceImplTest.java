package com.demo.service.service.impl;


import com.demo.item.pojo.SpecGroup;
import com.demo.service.service.SpecService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author jensen
 * @date 2016/9/26
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpecServiceImplTest {

    @Autowired
    private SpecService specService;

    @Test
    public void querySpecsByCid() {
        List<SpecGroup> groups = specService.querySpecsByCid(76L);
        for (SpecGroup group : groups) {
            System.out.println(group);
        }
    }
}