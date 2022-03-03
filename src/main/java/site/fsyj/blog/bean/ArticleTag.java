package site.fsyj.blog.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="tb_article_tag")
@Data
public class ArticleTag {
    @ApiModelProperty(value="")
    private Integer id;

    /**
    * 文章id
    */
    @ApiModelProperty(value="文章id")
    private Integer articleId;

    /**
    * 标签id
    */
    @ApiModelProperty(value="标签id")
    private Integer tagId;
}