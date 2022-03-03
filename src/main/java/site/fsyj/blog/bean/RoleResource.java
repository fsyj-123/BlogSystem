package site.fsyj.blog.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="tb_role_resource")
@Data
public class RoleResource {
    @ApiModelProperty(value="")
    private Integer id;

    /**
    * 角色id
    */
    @ApiModelProperty(value="角色id")
    private Integer roleId;

    /**
    * 权限id
    */
    @ApiModelProperty(value="权限id")
    private Integer resourceId;
}