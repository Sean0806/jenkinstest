package com.sean.own.jenkinstest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 沈聪
 * @Description
 * @create 2020-07-21 9:44
 */
@RestController
@RequestMapping("/testController")
public class TestController {

    @GetMapping("/testApi")
    public void testApi(){
        System.out.println("提交变更测试是否触发变更构建");
        System.out.println("成功进入接口");
    }
}
