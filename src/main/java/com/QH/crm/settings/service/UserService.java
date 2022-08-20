package com.QH.crm.settings.service;

import com.QH.crm.settings.model.User;

import java.util.List;
import java.util.Map;

/**
 * @author QH
 * @version V1.0.1
 * @Package com.QH.crm.settings.service
 * @date 2022/8/6 14:39
 */
public interface UserService {
    User queryUserByLoginActAndPwd(Map<String,Object> map);
    List<User> queryAllUsers();
    int saveNewUser(User user);
}
