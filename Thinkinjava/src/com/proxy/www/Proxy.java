package com.proxy.www;
//这是Source类的代理类
public class Proxy implements Sourceable{
	private Source s;
	public Proxy(){
		s=new Source();//定义一个Source类的对象
	}
	@Override
	public void method() {//这里添加了一些代理的功能
		// TODO Auto-generated method stub
		before();
		s.method();
		after();
	}
	public void before(){
		System.out.println("before proxy");
	}
	public void after(){
		System.out.println("after proxy");
	}
}
