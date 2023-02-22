package com.xhdp.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xhdp.entity.ShopType;
import com.xhdp.mapper.ShopTypeMapper;
import com.xhdp.service.IShopTypeService;
import org.springframework.stereotype.Service;

/**
 *  商店类型服务实现类
 */
@Service
public class ShopTypeServiceImpl extends ServiceImpl<ShopTypeMapper, ShopType> implements IShopTypeService {

}
