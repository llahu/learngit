package com.decorator.www;

public class Decorator implements Sourable{
	private Source s;//持有一个Source类的对象
	
	public Decorator(Source s){
		this.s=s;//这里进行Source类对象的初始化
	}
	@Override
	public void method() {
		// TODO Auto-generated method stub
		System.out.println("before decorator");
		s.method();
		System.out.println("after decorator");
	}

}
