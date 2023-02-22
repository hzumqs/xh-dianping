package com.xhdp.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xhdp.entity.Follow;
import com.xhdp.mapper.FollowMapper;
import com.xhdp.service.IFollowService;
import org.springframework.stereotype.Service;

/**
 *  用户关注服务实现类
 */
@Service
public class FollowServiceImpl extends ServiceImpl<FollowMapper, Follow> implements IFollowService {

}
