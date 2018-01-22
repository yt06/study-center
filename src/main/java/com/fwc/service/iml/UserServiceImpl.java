package com.fwc.service.iml;

import com.alibaba.fastjson.JSON;
import com.fwc.domain.User;
import com.fwc.service.IUserService;

/**
 * Created by fengweicao on 2017/8/23.
 */
public class UserServiceImpl implements IUserService {

    public User getUser(String jsonStr) {
        User user = JSON.parseObject(jsonStr, User.class);
        return user;
    }
}
