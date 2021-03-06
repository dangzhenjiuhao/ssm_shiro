package com.xjz.ssmshiro.web.dao;

import com.xjz.ssmshiro.core.generic.GenericDao;
import com.xjz.ssmshiro.web.model.Role;
import com.xjz.ssmshiro.web.model.RoleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 角色Dao 接口
 */
public interface RoleMapper extends GenericDao<Role, Long> {
    int countByExample(RoleExample example);

    int deleteByExample(RoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Role record);

    int insertSelective(Role record);

    List<Role> selectByExample(RoleExample example);

    Role selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Role record, @Param("example") RoleExample example);

    int updateByExample(@Param("record") Role record, @Param("example") RoleExample example);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);

    /**
     * 通过用户id 查询用户 拥有的角色
     *
     * @param userId
     * @return
     */
    List<Role> selectRolesByUserId(Long userId);
}
