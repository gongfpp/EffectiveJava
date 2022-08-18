package com.example.EffectiveJava.application;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gongfpp  https://github.com/gongfpp
 * @date 2022/8/15 13:53
 */
@RestController
@Slf4j
@RequestMapping("/API")
public class API {
    @GetMapping("/test")
    public String getTest(){
        log.info("收到测试get请求");
        return "Success";
    }
}
