package com.sample.hessianSpringMaven.service;

/**
 *
 * @date 2017年9月12日
 */
public class SayHelloImpl implements SayHello {

	@Override
	public String sayHello1(String name) {
		System.out.println("服务端方法sayHello1被调用！");
		return "Hello, "+name+"! This is sayHello1";
	}

	@Override
	public String sayHello2(String name) {
		System.out.println("服务端方法sayHello2被调用！");
		return "Hello, "+name+"! This is sayHello2";
	}

}
