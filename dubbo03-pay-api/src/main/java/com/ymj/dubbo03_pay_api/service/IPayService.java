package com.ymj.dubbo03_pay_api.service;

/**
 * @author : yemingjie
 * @date : 2021/6/13 22:56
 */
public interface IPayService {

    /**
     * 暴露出去的服务
     * @param info
     * @return
     */
    String pay(String info);
}
