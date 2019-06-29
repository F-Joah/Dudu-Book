package com.joah.springboot.user.service;

import com.joah.springboot.user.domain.User;
import com.joah.springboot.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User getOne(Long user_id) {

        return userMapper.getOne(user_id);
    }
}
