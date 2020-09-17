package com.mode.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mode.repositories.entity.User;
import com.mode.repositories.mapper.UserMapper;
import com.mode.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public  List<User> userList() {
       List<User> list = userMapper.selectList(new QueryWrapper<User>());
        return list;
    }
}
