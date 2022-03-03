package site.fsyj.blog.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(value="tb_chat_record")
@Data
public class ChatRecord {
    /**
    * 主键
    */
    @ApiModelProperty(value="主键")
    private Integer id;

    /**
    * 用户id
    */
    @ApiModelProperty(value="用户id")
    private Integer userId;

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
    * 聊天内容
    */
    @ApiModelProperty(value="聊天内容")
    private String content;

    /**
    * ip地址
    */
    @ApiModelProperty(value="ip地址")
    private String ipAddr;

    /**
    * ip来源
    */
    @ApiModelProperty(value="ip来源")
    private String ipSource;

    /**
    * 类型
    */
    @ApiModelProperty(value="类型")
    private Byte type;

    /**
    * 创建时间
    */
    @ApiModelProperty(value="创建时间")
    private Date createTime;
}