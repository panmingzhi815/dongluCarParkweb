package com.donglu.controller;

import com.donglu.bean.LoginUser;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
@Api(value = "用户接口")
public class LoginController {

    @ApiOperation(value="用户登录", notes="用户登录可使用该接口",httpMethod = "POST")
    @RequestMapping("/login")
    public ResultBody login(@PathParam("username") String username,@PathParam("password") String password){
        LoginUser loginUser = new LoginUser();
        loginUser.setUsername(username);
        loginUser.setPassword(password);
        return ResultBody.fail("用户名密码错误",null);
    }

}