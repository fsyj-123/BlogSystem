package site.fsyj.blog.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="tb_role_menu")
@Data
public class RoleMenu {
    /**
    * 主键
    */
    @ApiModelProperty(value="主键")
    private Integer id;

    /**
    * 角色id
    */
    @ApiModelProperty(value="角色id")
    private Integer roleId;

    /**
    * 菜单id
    */
    @ApiModelProperty(value="菜单id")
    private Integer menuId;
}