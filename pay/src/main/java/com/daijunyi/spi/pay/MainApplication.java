package com.daijunyi.spi.pay;

import com.daijunyi.spi.common.PayService;

import java.util.ServiceLoader;

/**
 * @author djy
 * @createTime 2022/9/4 20:51
 * @description
 */
public class MainApplication {

    public static void main(String[] args) {
        ServiceLoader<PayService> load = ServiceLoader.load(PayService.class);
        for (PayService payService : load) {
            payService.pay();
        }
    }

}
