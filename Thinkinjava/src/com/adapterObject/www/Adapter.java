package com.adapterObject.www;

//定义一个适配器类，用于持有Source类和实现Targetable接口
public class Adapter implements Targetable {
	//定义一个Source类，这样适配器类就可以持有一个Source类
	private Source s;
	public Adapter(Source s){
		this.s=s;
	}
	//只实现Targetable接口的method2()方法，继承Source类的method1()方法
	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("this is the targetable method!"); 
	}

	@Override
	//实现的是Targetable接口的方法，但是该方法的内部是调用Source类的method1方法
	public void method1() {
		// TODO Auto-generated method stub
		s.method1();
	}

}
