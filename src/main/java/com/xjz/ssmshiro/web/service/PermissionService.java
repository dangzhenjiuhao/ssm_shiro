package com.xjz.ssmshiro.web.service;

import com.xjz.ssmshiro.core.generic.GenericService;
import com.xjz.ssmshiro.web.model.Permission;

import java.util.List;

public interface PermissionService extends GenericService<Permission, Long> {
    /**
     * 通过角色id 查询角色 拥有的权限
     *
     * @param roleId
     * @return
     */
    List<Permission> selectPermissionsByRoleId(Long roleId);
}
