package site.fsyj.blog.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(value="tb_user_info")
@Data
public class UserInfo {
    /**
    * 用户ID
    */
    @ApiModelProperty(value="用户ID")
    private Integer id;

    /**
    * 邮箱号
    */
    @ApiModelProperty(value="邮箱号")
    private String email;

    /**
    * 用户昵称
    */
    @ApiModelProperty(value="用户昵称")
    private String nickname;

    /**
    * 用户头像
    */
    @ApiModelProperty(value="用户头像")
    private String avatar;

    /**
    * 用户简介
    */
    @ApiModelProperty(value="用户简介")
    private String intro;

    /**
    * 个人网站
    */
    @ApiModelProperty(value="个人网站")
    private String webSite;

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
    * 是否禁用
    */
    @ApiModelProperty(value="是否禁用")
    private Boolean isDisable;
}