package org.link.advertise.core.entity.tenant;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author javar1024
 * @description tenant_personnel
 * @date 2022-08-30
 */
@Data
public class TenantPersonnel implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
    /**
     * id
     */
    private Long id;

    /**
     * user_id
     */
    private Long userId;

    /**
     * username
     */
    private String username;

    /**
     * mobile
     */
    private String mobile;

    /**
     * avatar
     */
    private String avatar;

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

    /**
     * tenant_id
     */
    private Long tenantId;

    public TenantPersonnel() {
    }
}