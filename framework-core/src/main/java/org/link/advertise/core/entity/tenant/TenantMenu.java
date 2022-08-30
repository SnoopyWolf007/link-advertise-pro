package org.link.advertise.core.entity.tenant;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * @author javar1024
 * @description tenant_menu
 * @date 2022-08-30
 */
@Data
public class TenantMenu implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
    /**
     * tenant_id
     */
    private Long tenantId;

    /**
     * menu_id
     */
    private Long menuId;

    public TenantMenu() {
    }
}