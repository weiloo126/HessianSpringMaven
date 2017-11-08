package com.sample.hessianSpringMaven;
import java.net.MalformedURLException;

import com.caucho.hessian.client.HessianProxyFactory;
import com.sample.hessianSpringMaven.service.SayHello;


/**
 * @author LW  
 * @date 2017年9月12日
 */
public class NormalClient {

    public static void main(String[] args) throws MalformedURLException {  
        //Spring Hessian代理Servlet  
        String url = "http://localhost:80/hessian/sayHello";  
        HessianProxyFactory factory = new HessianProxyFactory();  
        SayHello service = (SayHello) factory.create(SayHello.class, url);  

        System.out.println(service.sayHello1("NormalClient"));  
    }  
}
