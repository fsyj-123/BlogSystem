package site.fsyj.blog.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(value="tb_comment")
@Data
public class Comment {
    @ApiModelProperty(value="")
    private Integer id;

    /**
    * 评论用户Id
    */
    @ApiModelProperty(value="评论用户Id")
    private Integer userId;

    /**
    * 评论文章id
    */
    @ApiModelProperty(value="评论文章id")
    private Integer articleId;

    /**
    * 评论内容
    */
    @ApiModelProperty(value="评论内容")
    private String commentContent;

    /**
    * 评论时间
    */
    @ApiModelProperty(value="评论时间")
    private Date createTime;

    /**
    * 回复用户id
    */
    @ApiModelProperty(value="回复用户id")
    private Integer replyId;

    /**
    * 父评论id
    */
    @ApiModelProperty(value="父评论id")
    private Integer parentId;

    /**
    * 是否删除  0否 1是
    */
    @ApiModelProperty(value="是否删除  0否 1是")
    private Byte isDelete;
}