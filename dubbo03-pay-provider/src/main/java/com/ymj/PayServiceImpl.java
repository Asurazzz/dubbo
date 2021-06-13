package com.ymj;

import com.ymj.dubbo03_pay_api.service.IPayService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author : yemingjie
 * @date : 2021/6/14 0:36
 */

public class PayServiceImpl implements IPayService {
    //执行支付的服务
    @Override
    public String pay(String info) {
        System.out.println("execute pay："+info);
        return "Hello Dubbo :"+info;
    }
}
