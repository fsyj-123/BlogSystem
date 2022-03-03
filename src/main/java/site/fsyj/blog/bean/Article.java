package site.fsyj.blog.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(value="tb_article")
@Data
public class Article {
    @ApiModelProperty(value="")
    private Integer id;

    /**
    * 作者
    */
    @ApiModelProperty(value="作者")
    private Integer userId;

    /**
    * 文章分类
    */
    @ApiModelProperty(value="文章分类")
    private Integer categoryId;

    /**
    * 文章缩略图
    */
    @ApiModelProperty(value="文章缩略图")
    private String articleCover;

    /**
    * 标题
    */
    @ApiModelProperty(value="标题")
    private String articleTitle;

    /**
    * 内容
    */
    @ApiModelProperty(value="内容")
    private String articleContent;

    /**
    * 发表时间
    */
    @ApiModelProperty(value="发表时间")
    private Date createTime;

    /**
    * 更新时间
    */
    @ApiModelProperty(value="更新时间")
    private Date updateTime;

    /**
    * 是否置顶 0否 1是
    */
    @ApiModelProperty(value="是否置顶 0否 1是")
    private Boolean isTop;

    /**
    * 是否为草稿 0否 1是
    */
    @ApiModelProperty(value="是否为草稿 0否 1是")
    private Boolean isDraft;

    /**
    * 是否删除  0否 1是
    */
    @ApiModelProperty(value="是否删除  0否 1是")
    private Boolean isDelete;
}