package com.ymj;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : yemingjie
 * @date : 2021/6/14 14:57
 */
@RestController
public class DubboController {

    @DubboReference
    ISayHelloService sayHelloService;

    @GetMapping("/sayHello")
    public String sayHello() {
        return sayHelloService.sayHello();
    }
}
