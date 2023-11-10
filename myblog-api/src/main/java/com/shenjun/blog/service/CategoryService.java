package com.shenjun.blog.service;


import com.shenjun.blog.vo.CategoryVo;
import com.shenjun.blog.vo.Result;
import org.springframework.stereotype.Service;

@Service
public interface CategoryService {

    CategoryVo findCategoryById(Long categoryId);

    /**
     * 查询所有分类
     *
     * @return
     */
    Result findAll();

    Result findAllDetail();

    Result categoryDetailById(Long id);
}
