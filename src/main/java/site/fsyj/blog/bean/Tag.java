package site.fsyj.blog.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(value="tb_tag")
@Data
public class Tag {
    @ApiModelProperty(value="")
    private Integer id;

    /**
    * 标签名
    */
    @ApiModelProperty(value="标签名")
    private String tagName;

    /**
    * 创建时间
    */
    @ApiModelProperty(value="创建时间")
    private Date createTime;
}