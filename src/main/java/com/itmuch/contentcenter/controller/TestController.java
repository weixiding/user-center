package com.itmuch.contentcenter.controller;

import com.itmuch.contentcenter.dao.user.UserMapper;
import com.itmuch.contentcenter.domain.entity.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private UserMapper userMapper;
    @RequestMapping("test")
    public User query() {
        User user =
                userMapper.selectByPrimaryKey(1);
        return user;

    }
}
