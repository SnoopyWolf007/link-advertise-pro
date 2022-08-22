package org.link.advertise.core.interceptor;

import org.apache.logging.log4j.util.Strings;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.link.advertise.core.annotation.Log;
import org.link.advertise.core.annotation.Permission;
import org.link.advertise.core.annotation.WhiteApi;
import org.link.advertise.core.model.IRequest;
import org.link.advertise.core.model.IResponse;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author jcm
 */
@Component
public class AuthInterceptor {

    @Pointcut("execution(public * org.link.advertise.*.controller..*.*(..))")
    public void preHandler() {

    }

    @Around("preHandler()")
    public Object postHandler(ProceedingJoinPoint point) throws Throwable {
        MethodSignature signature = (MethodSignature) point.getSignature();
        Method method = signature.getMethod();
        WhiteApi whiteApi = method.getAnnotation(WhiteApi.class);
        Log log = method.getAnnotation(Log.class);
        Permission permission = method.getAnnotation(Permission.class);

        if (permission == null) {
            throw new IllegalArgumentException("暂无权限");
        }

        if (log != null) {
            // TODO 日志记录
        }

        Object[] args = point.getArgs();
        if (args == null) {
            return point.proceed();
        }
        if (whiteApi != null) {
            return point.proceed(args);
        }
        for (int i = 0; i < args.length; i++) {
            if (args[i] instanceof IRequest) {
                IRequest iRequest = (IRequest) args[i];
                IRequest.Header header = iRequest.getHeader();
                if (header == null) {
                    return IResponse.fail().setMessage("请求头不能为空");
                }
                String token = header.getToken();
                if (Strings.isBlank(token)) {
                    return IResponse.fail().setCode(-100).setMessage("请求token不能为空");
                }
                // TODO 设置用户信息

                // TODO 判断是否有权限


                args[i] = iRequest;
            }
        }
        return point.proceed(args);
    }

}
