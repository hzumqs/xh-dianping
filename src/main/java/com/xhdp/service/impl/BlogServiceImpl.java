package com.xhdp.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xhdp.entity.Blog;
import com.xhdp.mapper.BlogMapper;
import com.xhdp.service.IBlogService;
import org.springframework.stereotype.Service;

/**
 *  文章服务实现类
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements IBlogService {

}
