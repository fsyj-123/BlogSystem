package site.fsyj.blog.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="tb_user_role")
@Data
public class UserRole {
    @ApiModelProperty(value="")
    private Integer id;

    /**
    * 用户id
    */
    @ApiModelProperty(value="用户id")
    private Integer userId;

    /**
    * 角色id
    */
    @ApiModelProperty(value="角色id")
    private Integer roleId;
}