package com.ymj.code01_rmi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * @author : yemingjie
 * @date : 2021/6/9 22:48
 */
public class CustomMain {
    public static void main(String[] args) throws Exception {

        // 注册中心
        Registry registry = LocateRegistry.getRegistry(999);
        // 发现服务
        ISayService iSayService = (ISayService) registry.lookup("iSayService");

        // 调起服务
        String name = iSayService.say("小萱");
        System.out.println("str : " + name);
    }
}
