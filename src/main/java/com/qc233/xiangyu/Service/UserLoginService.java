package com.qc233.xiangyu.Service;

import com.qc233.xiangyu.Pojo.Result;
import com.qc233.xiangyu.Pojo.User;

public interface UserLoginService {
    /**
     * 传递用户的基本注册信息
     * user对象内存在：用户名，密码散列值，加密密码，注册时间
     * @param user
     * @return 返回一个项目内Result对象
     */
    public Result register(User user);

    /**
     * 传递用户的登录信息 user对象内存在：用户名，密码原文
     * @param user
     * @return 返回一个项目内Result对象
     * Result:<br/>
     *      msg: 后台提示信息 <br/>
     *      code: 结果码<br/>
     *      date: 附加数据，不可直接使用List
     */
    public Result login(User user);
}
