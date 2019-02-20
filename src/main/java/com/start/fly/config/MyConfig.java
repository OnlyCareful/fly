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
    /**
     * 将方法的返回值添加到Spring容器中(相当于<bean></bean>)
     * @return 添加到容器中的对象
     */
    @Bean
    public HelloService helloService(){
        log.info("配置类@Bean给容器中添加组件");
        return new HelloService();
    }
}

