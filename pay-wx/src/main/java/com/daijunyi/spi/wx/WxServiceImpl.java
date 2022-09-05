package com.daijunyi.spi.wx;

import com.daijunyi.spi.common.PayService;

/**
 * @author djy
 * @createTime 2022/9/4 20:54
 * @description
 */
public class WxServiceImpl implements PayService {
    @Override
    public void pay() {
        System.out.println("微信支付");
    }
}
