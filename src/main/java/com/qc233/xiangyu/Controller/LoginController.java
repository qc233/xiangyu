package com.qc233.xiangyu.Controller;

import com.qc233.xiangyu.Pojo.Result;
import com.qc233.xiangyu.Pojo.User;
import com.qc233.xiangyu.Service.UserLoginService;
import com.qc233.xiangyu.Util.UserTools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    UserLoginService userLoginService;

    @ResponseBody
    @PostMapping("/register")
    public Result register(@RequestBody User user){
        user.setSalt(UserTools.randomStr(16));
        return userLoginService.register(user);
    }

    @ResponseBody
    @GetMapping("/password")
    public Result login(String username, String password){
        User user = new User();
        user.setNickname(username);
        user.setPassword(password);
        return userLoginService.login(user);
    }
    @ResponseBody
    @GetMapping("/token")
    public Result loginByToken(String username, String token){
        User user = new User();
        user.setNickname(username);
        user.setNowAuthToken(token);
        return userLoginService.loginByToken(user);
    }
}
