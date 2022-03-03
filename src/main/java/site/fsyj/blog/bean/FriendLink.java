package site.fsyj.blog.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(value="tb_friend_link")
@Data
public class FriendLink {
    @ApiModelProperty(value="")
    private Integer id;

    /**
    * 链接名
    */
    @ApiModelProperty(value="链接名")
    private String linkName;

    /**
    * 链接头像
    */
    @ApiModelProperty(value="链接头像")
    private String linkAvatar;

    /**
    * 链接地址
    */
    @ApiModelProperty(value="链接地址")
    private String linkAddress;

    /**
    * 链接介绍
    */
    @ApiModelProperty(value="链接介绍")
    private String linkIntro;

    /**
    * 创建时间
    */
    @ApiModelProperty(value="创建时间")
    private Date createTime;
}