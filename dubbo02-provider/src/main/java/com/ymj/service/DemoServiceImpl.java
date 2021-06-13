package com.ymj.service;

import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;

/**
 * @author : yemingjie
 * @date : 2021/6/13 13:43
 */
@DubboService(version = "1.0.0", timeout = 10000, interfaceClass = IDemoService.class)
@Component
public class DemoServiceImpl implements IDemoService{
    @Override
    public String say(String name) {
        System.out.println("hi" + name);
        return "hello " + name;
    }
}
