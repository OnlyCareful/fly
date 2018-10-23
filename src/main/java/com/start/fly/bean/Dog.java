package com.start.fly.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Component 将类交由Spring容器进行管理
 * @Value 将配置文件中指定的配置赋值给属性(亦可直接赋值和进行运算)(作用于成员变量或Set方法上)
 *        注意：只适用于获取#基本数据类型#的都数据
 */
@Component
public class Dog {
    @Value("${name}")
    private String name;
    @Value("18")
    private Integer age;
    @Value("#{10 * 2}")
    private Integer limit;

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", limit=" + limit +
                '}';
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}
