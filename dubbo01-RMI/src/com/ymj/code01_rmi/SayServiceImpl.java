package com.ymj.code01_rmi;

/**
 * @author : yemingjie
 * @date : 2021/6/9 22:44
 */
public class SayServiceImpl implements ISayService{
    @Override
    public String say(String name) throws Exception{
        System.out.println( name + " say : hello");
        return name + " say : hello";
    }
}
