package com.daijunyi.spi.ali;

import com.daijunyi.spi.common.PayService;

/**
 * @author djy
 * @createTime 2022/9/4 20:59
 * @description
 */
public class AliPayServiceImpl implements PayService {
    @Override
    public void pay() {
        System.out.println("支付宝支付");
    }
}
