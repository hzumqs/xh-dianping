package com.xhdp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xhdp.dto.Result;
import com.xhdp.entity.VoucherOrder;

/**
 *  优惠券订单服务类
 */
public interface IVoucherOrderService extends IService<VoucherOrder> {

    Result seckillVoucher(Long voucherId);
}
