package org.link.advertise.core.manager;

import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author g
 */
@Component
public class SessionManager {

    @Resource
    private StringRedisTemplate stringRedisTemplate;

}
