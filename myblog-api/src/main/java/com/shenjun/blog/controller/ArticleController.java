package com.shenjun.blog.controller;

import com.shenjun.blog.common.aop.LogAnnotation;
import com.shenjun.blog.common.cache.Cache;
import com.shenjun.blog.service.ArticleService;
import com.shenjun.blog.vo.Result;
import com.shenjun.blog.vo.params.ArticleParam;
import com.shenjun.blog.vo.params.PageParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController //json数据交互
@RequestMapping("articles")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    /**
     * 首页文章处理
     *
     * @param pageParams
     * @return
     */
    @PostMapping
    //对此接口记录日志
    @LogAnnotation(module = "文章", operater = "获取文章列表")
//    @Cache(expire = 5 * 60 * 1000, name = "listArticle")
    public Result listArticle(@RequestBody PageParams pageParams) {
//        int i = 10/0;
        return articleService.listArticle(pageParams);
    }

    /**
     * 首页最热文章
     *
     * @return
     */
    @PostMapping("hot")
//    @Cache(expire = 5 * 60 * 1000, name = "hot_article")
    public Result hotArticle() {
        int limit = 5;
        return articleService.hotArticle(limit);
    }


    /**
     * 首页最热文章
     *
     * @return
     */
    @PostMapping("new")
//    @Cache(expire = 5 * 60 * 1000, name = "news_article")
    public Result newArticle() {
        int limit = 5;
        return articleService.newsArticle(limit);
    }


    /**
     * 首页 文章归档
     *
     * @return
     */
    @PostMapping("listArchives")
    public Result listArchives() {
        return articleService.listArchives();
    }

    @PostMapping("view/{id}")
    public Result findArticleById(@PathVariable("id") Long id) {
        return articleService.findArticleById(id);
    }

    //接口url：/articles/publish
    //
    //请求方式：POST
    @PostMapping("publish")
    public Result publish(@RequestBody ArticleParam articleParam) {
        return articleService.publish(articleParam);
    }

    @PostMapping("search")
    public Result search(@RequestBody ArticleParam articleParam) {
        //写一个搜索接口
        String search = articleParam.getSearch();
        return articleService.searchArticle(search);
    }

    //修改文章
    @PostMapping("{id}")
    public Result articleById(@PathVariable("id") Long articleId) {
        return articleService.findArticleById(articleId);
    }
}
