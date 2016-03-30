package com.adapterInterface.www;

//定义一个抽象类，该类实现了Sourceable接口
public abstract class Wrapper implements Sourceable {

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("this is wrapper.method1" );
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("this is wrapper.method2" );
	}

}
