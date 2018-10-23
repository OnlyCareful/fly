package com.start.fly.config;

import com.start.fly.service.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration 指定当前类为配置类（相当于Spring配置文件）
 */
@Slf4j
@Configuration
public class MyConfig {

    @Bean  // 将方法的返回值添加到Spring容器中(相当于<bean></bean>)
    public HelloService helloService(){
        log.info("配置类@Bean给容器中添加组件");
        return new HelloService();
    }
}

