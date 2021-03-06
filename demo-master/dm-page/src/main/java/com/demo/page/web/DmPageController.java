package com.demo.page.web;

import com.demo.page.service.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Map;

/**
 * @author jensen
 * @date 2016/9/26
 */
@Controller
public class DmPageController {

    @Autowired
    private PageService pageService;

    @GetMapping("item/{id}.html")
    public String toItemPage(@PathVariable("id") Long spuId, Model model) {
        Map<String, Object> attributes = pageService.loadModel(spuId);
        model.addAllAttributes(attributes);
        return "item";

    }

}
