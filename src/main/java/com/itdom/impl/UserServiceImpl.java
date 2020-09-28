package com.itdom.impl;

import com.itdom.UserService;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
    public String getInfo(String parameter) {
        return "this is demo"+parameter;
    }
}
