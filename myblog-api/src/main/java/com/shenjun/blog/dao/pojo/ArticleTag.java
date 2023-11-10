package com.shenjun.blog.dao.pojo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.Data;

@Data
public class ArticleTag {
    private Long id;

    private Long articleId;

    private Long tagId;
}
