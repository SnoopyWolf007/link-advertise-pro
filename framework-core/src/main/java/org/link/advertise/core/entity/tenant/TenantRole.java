package org.link.advertise.core.entity.tenant;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * @author javar1024
 * @description tenant_role
 * @date 2022-08-30
 */
@Data
public class TenantRole implements Serializable {

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
     * sys_role_ids
     */
    private String sysRoleIds;

    public TenantRole() {
    }
}