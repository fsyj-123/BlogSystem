package site.fsyj.blog.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(value="tb_user_auth")
@Data
public class UserAuth {
    @ApiModelProperty(value="")
    private Integer id;

    /**
    * 用户信息id
    */
    @ApiModelProperty(value="用户信息id")
    private Integer userInfoId;

    /**
    * 用户名
    */
    @ApiModelProperty(value="用户名")
    private String username;

    /**
    * 密码
    */
    @ApiModelProperty(value="密码")
    private String password;

    /**
    * 登录类型
    */
    @ApiModelProperty(value="登录类型")
    private Boolean loginType;

    /**
    * 用户登录ip
    */
    @ApiModelProperty(value="用户登录ip")
    private String ipAddr;

    /**
    * ip来源
    */
    @ApiModelProperty(value="ip来源")
    private String ipSource;

    /**
    * 创建时间
    */
    @ApiModelProperty(value="创建时间")
    private Date createTime;

    /**
    * 上次登录时间
    */
    @ApiModelProperty(value="上次登录时间")
    private Date lastLoginTime;
}