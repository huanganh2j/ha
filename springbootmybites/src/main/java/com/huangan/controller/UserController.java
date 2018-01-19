package com.huangan.controller;

import com.huangan.entity.UserRequest;
import com.huangan.service.UserService;
import io.swagger.annotations.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
* Company:千山健康
* Author:an.huang
* Date:2018/1/4
*/
@RestController
@RequestMapping("/springUser")
public class UserController {
    Logger logger = LogManager.getLogger(UserController.class);
    @Autowired
    UserService userService;

    @ApiOperation(value = "获取所有用户",notes = "分页获取所有用户",httpMethod = "GET")
    @RequestMapping("/queryByPage")
    public String queryByPage(){
        return userService.queryByPage();
    }

    @ApiOperation(value = "新增单个用户",notes = "新增单个用户信息",httpMethod = "POST")
    @RequestMapping("/insertUser")
    public String insertUser(@RequestBody @ApiParam(name = "用户对象",value = "传入json格式",required = true) UserRequest userRequest){
        try {
            return userService.insertUser(userRequest);
        }catch (Exception e){
            e.printStackTrace();
            logger.error(e.getMessage());
            return "error";
        }
    }

    @ApiOperation(value = "测试多环境使用",notes = "多个环境不同的配置",httpMethod = "GET")
    @RequestMapping("/queryEnv")
    public String queryEnv(){
        return userService.queryEnv();
    }

}
