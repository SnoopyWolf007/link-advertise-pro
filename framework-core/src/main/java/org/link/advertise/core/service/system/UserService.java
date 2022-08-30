package org.link.advertise.core.service.system;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.link.advertise.core.dao.system.UserDAO;
import org.link.advertise.core.entity.system.User;
import org.springframework.stereotype.Service;

/**
 * @author g
 */
@Service
public class UserService extends ServiceImpl<UserDAO, User> {
}
