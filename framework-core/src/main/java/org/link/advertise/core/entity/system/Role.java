package org.link.advertise.core.entity.system;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * @author javar1024
 * @description role
 * @date 2022-08-30
 */
@Data
public class Role implements Serializable {

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
     * description
     */
    private String description;

    public Role() {
    }
}