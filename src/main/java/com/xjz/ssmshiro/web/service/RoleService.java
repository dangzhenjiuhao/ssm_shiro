package com.xjz.ssmshiro.web.service;

import com.xjz.ssmshiro.core.generic.GenericService;
import com.xjz.ssmshiro.web.model.Role;

import java.util.List;

/**
 * 角色 业务接口
 */
public interface RoleService extends GenericService<Role, Long> {
    /**
     * 通过用户id 查询用户 拥有的角色
     *
     * @param userId
     * @return
     */
    List<Role> selectRolesByUserId(Long userId);
}
