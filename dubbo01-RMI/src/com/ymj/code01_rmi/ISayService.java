package com.ymj.code01_rmi;

import java.rmi.Remote;

/**
 * @author : yemingjie
 * @date : 2021/6/9 22:42
 */
public interface ISayService extends Remote {

    /**
     * 一定要加throws Exception不然会报错
     * @param name
     * @return
     * @throws Exception
     */
    String say(String name) throws Exception;
}
