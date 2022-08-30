package org.link.advertise.core.entity.system;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author javar1024
 * @description user
 * @date 2022-08-30
 */
@Data
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
    /**
     * id
     */
    private Long id;

    /**
     * 账号
     */
    private String username;

    /**
     * 登录密码
     */
    private String password;

    /**
     * 手机号码
     */
    private String mobile;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 头像
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

    public User() {
    }
}