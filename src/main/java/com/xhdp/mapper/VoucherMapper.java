package com.xhdp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xhdp.entity.Voucher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 *  优惠券Mapper 接口
 */
public interface VoucherMapper extends BaseMapper<Voucher> {

    List<Voucher> queryVoucherOfShop(@Param("shopId") Long shopId);
}
