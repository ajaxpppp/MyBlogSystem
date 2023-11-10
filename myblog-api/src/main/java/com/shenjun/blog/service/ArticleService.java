package com.shenjun.blog.service;

import com.shenjun.blog.vo.Result;
import com.shenjun.blog.vo.params.ArticleParam;
import com.shenjun.blog.vo.params.PageParams;

public interface ArticleService {

    /**
     * 分页查询文章列表
     */

    Result listArticle(PageParams pageParams);

    /**
     * 最热文章
     *
     * @param limit
     * @return
     */
    Result hotArticle(int limit);

    /**
     * 最新文章
     *
     * @param limit
     * @return
     */
    Result newsArticle(int limit);

    /**
     * 文章归档
     *
     * @return
     */
    Result listArchives();

    /**
     * 查看文章详情
     *
     * @param articleId
     * @return
     */
    Result findArticleById(Long articleId);

    Result publish(ArticleParam articleParam);

    Result searchArticle(String search);
}
