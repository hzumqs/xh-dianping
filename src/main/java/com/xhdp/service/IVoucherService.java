package com.xhdp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xhdp.dto.Result;
import com.xhdp.entity.Voucher;

/**
 *  优惠券服务类
 */
public interface IVoucherService extends IService<Voucher> {

    Result queryVoucherOfShop(Long shopId);

    void addSeckillVoucher(Voucher voucher);
}
