package org.link.advertise.core.entity.system;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author javar1024
 * @description menu
 * @date 2022-08-30
 */
@Data
public class Menu implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
    /**
     * id
     */
    private Long id;

    /**
     * code
     */
    private String code;

    /**
     * name
     */
    private String name;

    /**
     * level
     */
    private Integer level;

    /**
     * parent_id
     */
    private Long parentId;

    /**
     * sort
     */
    private Integer sort;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date modifyTime;

    /**
     * 状态。正常=normal、暂停=pause
     */
    private String status;

    /**
     * 是否删除
     */
    private Boolean deleteFlag;

    public Menu() {
    }
}