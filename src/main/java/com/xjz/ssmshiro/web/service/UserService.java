package com.xjz.ssmshiro.web.service;

import com.xjz.ssmshiro.core.generic.GenericService;
import com.xjz.ssmshiro.web.model.User;

/**
 * 用户 业务 接口
 */
public interface UserService extends GenericService<User,Long>{
    /**
     * 用户验证
     *
     * @param user
     * @return
     */
    User authentication(User user);

    /**
     * 根据用户名查询用户
     *
     * @param username
     * @return
     */
    User selectByUsername(String username);
}
