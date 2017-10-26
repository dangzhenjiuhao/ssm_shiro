package com.xjz.ssmshiro.web.service.impl;

import com.xjz.ssmshiro.core.generic.GenericDao;
import com.xjz.ssmshiro.core.generic.GenericServiceImpl;
import com.xjz.ssmshiro.web.dao.PermissionMapper;
import com.xjz.ssmshiro.web.model.Permission;
import com.xjz.ssmshiro.web.service.PermissionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 权限Service实现类
 */
@Service
public class PermissionServiceImpl extends GenericServiceImpl<Permission, Long> implements PermissionService {

    @Resource
    private PermissionMapper permissionMapper;

    @Override
    public GenericDao<Permission, Long> getDao() {
        return permissionMapper;
    }

    @Override
    public List<Permission> selectPermissionsByRoleId(Long roleId) {
        return permissionMapper.selectPermissionsByRoleId(roleId);
    }
}
