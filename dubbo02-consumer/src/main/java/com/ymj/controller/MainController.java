package com.ymj.controller;

import com.ymj.service.IDemoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : yemingjie
 * @date : 2021/6/13 15:04
 */
@RestController
@RequestMapping("/main")
public class MainController {

    @DubboReference(version = "1.0.0")
    IDemoService demoService;

    @RequestMapping("/say")
    public String say() {
        return demoService.say("小叶✌");
    }
}
