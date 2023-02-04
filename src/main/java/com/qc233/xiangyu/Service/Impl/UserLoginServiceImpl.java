package com.qc233.xiangyu.Service.Impl;

import com.qc233.xiangyu.Pojo.Result;
import com.qc233.xiangyu.Pojo.User;
import com.qc233.xiangyu.Service.UserLoginService;
import org.springframework.stereotype.Service;

@Service
public class UserLoginServiceImpl implements UserLoginService {
    @Override
    public Result register(User user) {

        /*
         *  TODO 实现用户注册
         *  注册后需要将用户对象内的明文密码转换为加密密码后，再上传至数据库
         *  加密方式为：（密码原文+密码散列值）进行MD5运算或SHA256运算
         */
        return null;
    }

    @Override
    public Result login(User user) {

        /* TODO 实现用户登录
         * 使用密码登陆要为用户生成一个新的nowAuthToken并上传至数据库同时发送给用户
         */
        return null;
    }

    @Override
    public Result login(User user, String authToken) {
        /* TODO 实现用户Token登录*/
        return null;
    }
}
