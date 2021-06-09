package com.ymj.code01_rmi;


import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author : yemingjie
 * @date : 2021/6/9 22:45
 */
public class ServiceMain {

    public static void main(String[] args) throws RemoteException {
        // 实例化要暴露给远程的方法/接口
        ISayService sayService = new SayServiceImpl();
        // 开启本地服务
        ISayService iSayService = (ISayService) UnicastRemoteObject.exportObject(sayService, 666);
        // 服务注册中心
        Registry registry = LocateRegistry.createRegistry(999);
        // 注册服务
        registry.rebind("iSayService", iSayService);

    }
}
