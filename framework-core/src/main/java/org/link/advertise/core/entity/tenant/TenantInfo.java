package org.link.advertise.core.entity.tenant;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author javar1024
 * @description tenant_info
 * @date 2022-08-30
 */
@Data
public class TenantInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
    /**
     * id
     */
    private Long id;

    /**
     * 编码
     */
    private String code;

    /**
     * 昵称
     */
    private String name;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 拥有者
     */
    private Long ownerUserId;

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

    public TenantInfo() {
    }
}