package com.ymj.springboot;

import com.ymj.ISayHelloService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author : yemingjie
 * @date : 2021/6/14 14:37
 */
@DubboService
public class SayHelloServiceImpl implements ISayHelloService {
    @Override
    public String sayHello() {
        return "Hello Dubbo ";
    }
}
