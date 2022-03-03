package site.fsyj.blog.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(value="tb_operation_log")
@Data
public class OperationLog {
    /**
    * 主键id
    */
    @ApiModelProperty(value="主键id")
    private Integer id;

    /**
    * 操作模块
    */
    @ApiModelProperty(value="操作模块")
    private String optModule;

    /**
    * 操作类型
    */
    @ApiModelProperty(value="操作类型")
    private String optType;

    /**
    * 操作url
    */
    @ApiModelProperty(value="操作url")
    private String optUrl;

    /**
    * 操作方法
    */
    @ApiModelProperty(value="操作方法")
    private String optMethod;

    /**
    * 操作描述
    */
    @ApiModelProperty(value="操作描述")
    private String optDesc;

    /**
    * 请求参数
    */
    @ApiModelProperty(value="请求参数")
    private String requestParam;

    /**
    * 请求方式
    */
    @ApiModelProperty(value="请求方式")
    private String requestMethod;

    /**
    * 返回数据
    */
    @ApiModelProperty(value="返回数据")
    private String responseData;

    /**
    * 用户id
    */
    @ApiModelProperty(value="用户id")
    private Integer userId;

    /**
    * 用户昵称
    */
    @ApiModelProperty(value="用户昵称")
    private String nickname;

    /**
    * 操作ip
    */
    @ApiModelProperty(value="操作ip")
    private String ipAddr;

    /**
    * 操作地址
    */
    @ApiModelProperty(value="操作地址")
    private String ipSource;

    /**
    * 创建时间
    */
    @ApiModelProperty(value="创建时间")
    private Date createTime;
}