package com.start.fly;

import com.start.fly.bean.Dog;
import com.start.fly.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FlyApplicationTests {

    @Autowired
    // Spring 容器类
    ApplicationContext ioc;

    @Autowired
    private Person person;
    @Autowired
    private Dog dog;
    @Test
    public void contextLoads() {
        System.out.println(dog);
        System.out.println(person);
    }

    @Test
    public void bean(){
        boolean b = ioc.containsBean("helloService");
        System.out.println(b);
    }

}
