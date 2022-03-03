package site.fsyj.blog.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(value="tb_resource")
@Data
public class Resource {
    /**
    * 主键
    */
    @ApiModelProperty(value="主键")
    private Integer id;

    /**
    * 资源名
    */
    @ApiModelProperty(value="资源名")
    private String resourceName;

    /**
    * 权限路径
    */
    @ApiModelProperty(value="权限路径")
    private String url;

    /**
    * 请求方式
    */
    @ApiModelProperty(value="请求方式")
    private String requestMethod;

    /**
    * 父权限id
    */
    @ApiModelProperty(value="父权限id")
    private Integer parentId;

    /**
    * 创建时间
    */
    @ApiModelProperty(value="创建时间")
    private Date createTime;

    /**
    * 修改时间
    */
    @ApiModelProperty(value="修改时间")
    private Date updateTime;

    /**
    * 是否禁用 0否 1是
    */
    @ApiModelProperty(value="是否禁用 0否 1是")
    private Boolean isDisable;

    /**
    * 是否匿名访问 0否 1是
    */
    @ApiModelProperty(value="是否匿名访问 0否 1是")
    private Byte isAnonymous;
}