package com.shenjun.blog.controller;

import com.shenjun.blog.common.aop.LogAnnotation;
import com.shenjun.blog.service.CategoryService;
import com.shenjun.blog.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("categorys")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;


    @GetMapping
    public Result categories() {
        return categoryService.findAll();
    }

    @GetMapping("detail")
    public Result categoriesDetail() {
        return categoryService.findAllDetail();
    }

    ///category/detail/{id}
    @GetMapping("detail/{id}")
    public Result categoryDetailById(@PathVariable("id") Long id) {
        return categoryService.categoryDetailById(id);
    }
}
