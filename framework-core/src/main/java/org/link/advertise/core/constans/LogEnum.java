package org.link.advertise.core.constans;

/**
 * @author jcm
 */
public enum LogEnum {

    /**
     * 插入
     */
    INSERT("INSERT", "插入"),

    /**
     * 更新
     */
    UPDATE("UPDATE", "更新"),

    /**
     * 删除
     */
    DELETE("DELETE", "删除"),

    /**
     * 登录
     */
    LOGIN("LOGIN", "登录"),

    /**
     * 其他
     */
    OTHER("OTHER", "其他");


    private final String code;
    private final String name;

    private LogEnum(String code, String name) {
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
