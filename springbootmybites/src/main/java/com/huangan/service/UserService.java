package com.huangan.service;

import com.huangan.entity.UserRequest;
import com.huangan.mapper.SpringUserMapper;
import com.huangan.model.SpringUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Company:千山健康
 * Author:an.huang
 * Date:2018/1/4
 */
@Service
public class UserService implements UserServiceI {
    @Autowired
    SpringUserMapper springUserMapper;
    @Value("${init.param}")
    String param;
    @Override
    public String queryByPage() {
        List<SpringUser> users = springUserMapper.selectAll();
        return users.size() + "个数据结果yeyeye";
    }


    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    @Override
    public String insertUser(UserRequest userRequest) throws Exception {
        try {
            springUserMapper.insertSelective(userRequest);
            return "success";
        }catch (Exception e){
            e.printStackTrace();
            throw new Exception("error");
        }
    }

    @Override
    public String queryEnv() {
        return "current env is "+param;
    }
}
