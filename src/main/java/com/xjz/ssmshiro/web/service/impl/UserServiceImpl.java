package com.xjz.ssmshiro.web.service.impl;

import com.xjz.ssmshiro.core.generic.GenericDao;
import com.xjz.ssmshiro.core.generic.GenericServiceImpl;
import com.xjz.ssmshiro.web.dao.UserMapper;
import com.xjz.ssmshiro.web.model.User;
import com.xjz.ssmshiro.web.model.UserExample;
import com.xjz.ssmshiro.web.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户Service实现类
 */
@Service
public class UserServiceImpl extends GenericServiceImpl<User, Long> implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public GenericDao<User, Long> getDao() {
        return userMapper;
    }

    @Override
    public int insert(User user) {
        return userMapper.insertSelective(user);
    }

    @Override
    public int update(User user) {
        return userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public int delete(Long id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public User authentication(User user) {
        return userMapper.authenication(user);
    }

    @Override
    public User selectOne(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public User selectByUsername(String username) {
        UserExample example = new UserExample();
        example.createCriteria().andUsernameEqualTo(username);
        final List<User> list = userMapper.selectByExample(example);
        return list.get(0);
    }
}
