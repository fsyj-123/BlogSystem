package site.fsyj.blog.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(value="tb_role")
@Data
public class Role {
    /**
    * 主键id
    */
    @ApiModelProperty(value="主键id")
    private Integer id;

    /**
    * 角色名
    */
    @ApiModelProperty(value="角色名")
    private String roleName;

    /**
    * 角色描述
    */
    @ApiModelProperty(value="角色描述")
    private String roleLabel;

    /**
    * 创建时间
    */
    @ApiModelProperty(value="创建时间")
    private Date createTime;

    /**
    * 更新时间
    */
    @ApiModelProperty(value="更新时间")
    private Date updateTime;

    /**
    * 是否禁用  0否 1是
    */
    @ApiModelProperty(value="是否禁用  0否 1是")
    private Boolean isDisable;
}