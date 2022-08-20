package com.QH.crm.settings.service.impl;

import com.QH.crm.settings.mapper.UserMapper;
import com.QH.crm.settings.model.User;
import com.QH.crm.settings.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author QH
 * @version V1.0.1
 * @Package com.QH.crm.settings.service.impl
 * @date 2022/8/6 14:43
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User queryUserByLoginActAndPwd(Map<String, Object> map) {
        return userMapper.selectUserByLoginActAndPwd(map);
    }

    @Override
    public List<User> queryAllUsers() {
        return userMapper.selectAllUsers();
    }

    @Override
    public int saveNewUser(User user) {
        return userMapper.insertNewUser(user);
    }
}
