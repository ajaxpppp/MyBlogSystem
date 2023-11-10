package com.shenjun.blog.service;

import com.shenjun.blog.vo.Result;
import com.shenjun.blog.vo.params.CommentParam;

public interface CommentsService {
    /**
     * 根据文字id查询评论列表
     *
     * @param id
     * @return
     */
    Result comentsByArticleId(Long id);

    Result comment(CommentParam commentParam);

}
