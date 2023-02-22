package com.xhdp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xhdp.entity.Shop;

/**
 *  商店服务类
 */
public interface IShopService extends IService<Shop> {

    Result queryById(Long id);

    Result update(Shop shop);

    Result queryShopByType(Integer typeId, Integer current, Double x, Double y);
}
