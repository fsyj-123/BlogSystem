package site.fsyj.blog.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(value="tb_menu")
@Data
public class Menu {
    /**
    * 主键
    */
    @ApiModelProperty(value="主键")
    private Integer id;

    /**
    * 菜单名
    */
    @ApiModelProperty(value="菜单名")
    private String name;

    /**
    * 菜单路径
    */
    @ApiModelProperty(value="菜单路径")
    private String path;

    /**
    * 组件
    */
    @ApiModelProperty(value="组件")
    private String component;

    /**
    * 菜单icon
    */
    @ApiModelProperty(value="菜单icon")
    private String icon;

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
    * 排序
    */
    @ApiModelProperty(value="排序")
    private Byte orderNum;

    /**
    * 父id
    */
    @ApiModelProperty(value="父id")
    private Integer parentId;

    /**
    * 是否禁用 0否1是
    */
    @ApiModelProperty(value="是否禁用 0否1是")
    private Boolean isDisable;

    /**
    * 是否隐藏  0否1是
    */
    @ApiModelProperty(value="是否隐藏  0否1是")
    private Boolean isHidden;
}