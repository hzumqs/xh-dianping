package com.xhdp.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xhdp.entity.BlogComments;
import com.xhdp.mapper.BlogCommentsMapper;
import com.xhdp.service.IBlogCommentsService;
import org.springframework.stereotype.Service;

/**
 *  文章评论服务实现类
 */
@Service
public class BlogCommentsServiceImpl extends ServiceImpl<BlogCommentsMapper, BlogComments> implements IBlogCommentsService {

}
