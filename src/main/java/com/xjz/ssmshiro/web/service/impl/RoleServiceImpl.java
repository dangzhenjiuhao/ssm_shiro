package com.xjz.ssmshiro.web.service.impl;

import com.xjz.ssmshiro.core.generic.GenericDao;
import com.xjz.ssmshiro.core.generic.GenericServiceImpl;
import com.xjz.ssmshiro.web.dao.RoleMapper;
import com.xjz.ssmshiro.web.model.Role;
import com.xjz.ssmshiro.web.service.RoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 角色Service实现类
 */
@Service
public class RoleServiceImpl extends GenericServiceImpl<Role, Long> implements RoleService {
    @Resource
    private RoleMapper roleMapper;

    @Override
    public GenericDao<Role, Long> getDao() {
        return roleMapper;
    }

    @Override
    public List<Role> selectRolesByUserId(Long userId) {
        return roleMapper.selectRolesByUserId(userId);
    }
}
