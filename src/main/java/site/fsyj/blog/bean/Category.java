package site.fsyj.blog.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(value="tb_category")
@Data
public class Category {
    @ApiModelProperty(value="")
    private Integer id;

    /**
    * 分类名
    */
    @ApiModelProperty(value="分类名")
    private String categoryName;

    /**
    * 创建时间
    */
    @ApiModelProperty(value="创建时间")
    private Date createTime;
}