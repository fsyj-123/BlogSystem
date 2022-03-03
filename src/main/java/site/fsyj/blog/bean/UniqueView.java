package site.fsyj.blog.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(value="tb_unique_view")
@Data
public class UniqueView {
    @ApiModelProperty(value="")
    private Integer id;

    /**
    * 时间
    */
    @ApiModelProperty(value="时间")
    private Date createTime;

    /**
    * 访问量
    */
    @ApiModelProperty(value="访问量")
    private Integer viewsCount;
}