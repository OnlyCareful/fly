package com.start.fly.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * 返回视图测试
 * @author InnerConce
 * @date 2019/02/20
 */
@Controller
public class ThymeleafController {

    @RequestMapping("/success")
    public String getSuccess(Map<String, Object> map){
        map.put("get","你好");
        return "success";
    }
}
