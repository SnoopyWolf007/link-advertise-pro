package org.link.advertise.core.annotation;

import org.link.advertise.core.constans.PermissionEnum;

import java.lang.annotation.*;

/**
 * 允许通过
 *
 * @author jcm
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Permission {

    /***
     * 权限设置查看
     * @see org.link.advertise.core.constans.PermissionEnum
     * */
    PermissionEnum[] value() default PermissionEnum.ADMIN;

}
