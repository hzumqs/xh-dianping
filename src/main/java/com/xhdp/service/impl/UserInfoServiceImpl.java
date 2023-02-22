package com.xhdp.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xhdp.entity.UserInfo;
import com.xhdp.mapper.UserInfoMapper;
import com.xhdp.service.IUserInfoService;
import org.springframework.stereotype.Service;

/**
 *  用户信息服务实现类
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements IUserInfoService {

}
