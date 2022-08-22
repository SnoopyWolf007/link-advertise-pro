package org.link.advertise.core.annotation;

import org.link.advertise.core.constans.LogEnum;

import java.lang.annotation.*;

/**
 * 日志记录
 *
 * @author jcm
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Log {

    LogEnum type() default LogEnum.OTHER;

}
