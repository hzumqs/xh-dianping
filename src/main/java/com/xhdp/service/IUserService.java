package com.xhdp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xhdp.dto.LoginFormDTO;
import com.xhdp.dto.Result;
import com.xhdp.entity.User;

import javax.servlet.http.HttpSession;

/**
 *  用户服务类
 */
public interface IUserService extends IService<User> {

    Result sendCode(String phone, HttpSession session);

    Result login(LoginFormDTO loginForm, HttpSession session);
}
