package com.ozm.omy.service.impl;


import com.ozm.omy.mapper.UserMapper;
import com.ozm.omy.pojo.User;
import com.ozm.omy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public List<User> findUser() {
        List<User> users = userMapper.fingUser();
        boolean empty = users.isEmpty();
        return userMapper.fingUser();
    }
}
