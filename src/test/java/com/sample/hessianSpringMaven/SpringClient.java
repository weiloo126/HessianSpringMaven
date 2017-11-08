package com.sample.hessianSpringMaven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sample.hessianSpringMaven.service.SayHello;

public class SpringClient {
    public static void main(String[] args) {  
         ApplicationContext contex = 
                 new ClassPathXmlApplicationContext("config/hessian-client.xml");
        // 获得客户端的Hessian代理工厂bean  
        SayHello i = (SayHello) contex.getBean("sayHelloService");  
        System.out.println(i.sayHello2("SpringClient"));  
    }  
}