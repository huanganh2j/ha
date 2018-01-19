package com.huangan.entity;

import com.huangan.model.SpringUser;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
* Company:千山健康
* Author:an.huang
* Date:2018/1/19
*/
@ApiModel(value = "用户对象信息")
public class UserRequest extends SpringUser implements Serializable{
    @ApiModelProperty(value = "用户名",required = true,notes = "用户名",name ="name")
    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
