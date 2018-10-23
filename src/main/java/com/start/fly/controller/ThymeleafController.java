package com.start.fly.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class ThymeleafController {

    @RequestMapping("/success")
    public String getSuccess(Map<String, Object> map){
        map.put("get","你好");
        return "success";
    }
}
