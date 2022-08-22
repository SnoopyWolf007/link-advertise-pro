package org.link.advertise.core.constans;

/**
 * @author jcm
 */
public enum PermissionEnum {
    /**
     * 系统超级管理员
     */
    ADMIN("ADMIN", "超级管理员"),

    /**
     * 租户超级管理员
     */
    TENANT_ADMIN("TENANT_ADMIN", "超级管理员"),

    /**
     * 租户负责人
     */
    TENANT_LEADER("TENANT_LEADER", "负责人")

    /**
     * 租户广告投手
     * */
    , TENANT_AD("TENANT_AD", "广告投手"),

    /**
     * 租户销售员
     */
    TENANT_SALESMAN("TENANT_SALESMAN", "销售员");

    private String code;
    private String name;

    private PermissionEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
