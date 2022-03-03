package site.fsyj.blog.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(value="tb_message")
@Data
public class Message {
    /**
    * 主键id
    */
    @ApiModelProperty(value="主键id")
    private Integer id;

    /**
    * 用户ip
    */
    @ApiModelProperty(value="用户ip")
    private String ipAddress;

    /**
    * 用户地址
    */
    @ApiModelProperty(value="用户地址")
    private String ipSource;

    /**
    * 昵称
    */
    @ApiModelProperty(value="昵称")
    private String nickname;

    /**
    * 头像
    */
    @ApiModelProperty(value="头像")
    private String avatar;

    /**
    * 留言内容
    */
    @ApiModelProperty(value="留言内容")
    private String messageContent;

    /**
    * 弹幕速度
    */
    @ApiModelProperty(value="弹幕速度")
    private Boolean time;

    /**
    * 发布时间
    */
    @ApiModelProperty(value="发布时间")
    private Date createTime;
}