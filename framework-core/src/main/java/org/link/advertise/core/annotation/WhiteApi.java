package org.link.advertise.core.annotation;

import java.lang.annotation.*;

/**
 * 白名单
 *
 * @author jcm
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface WhiteApi {
}
