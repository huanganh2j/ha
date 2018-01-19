package com.huangan.service;

import com.huangan.entity.UserRequest;
import com.huangan.model.SpringUser;

/**
* Company:千山健康
* Author:an.huang
* Date:2018/1/4
*/
public interface UserServiceI {
    public String queryByPage();

    public String insertUser(UserRequest userRequest) throws Exception;

    public String queryEnv();
}
