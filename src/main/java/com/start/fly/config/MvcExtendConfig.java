package com.start.fly.config;

import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//@EnableWebMvc //全面接管SpringMVC配置（自动配置失效）
@Configuration
public class MvcExtendConfig implements WebMvcConfigurer {
    // 重写WebMvcConfigurer接口中的方法进行扩展配置
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {

    }
}
