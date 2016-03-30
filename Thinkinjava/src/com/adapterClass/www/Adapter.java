package com.adapterClass.www;

//定义一个适配器类，用于继承Source类和实现Targetable接口
public class Adapter extends Source implements Targetable {

	
	//只实现Targetable接口的method2()方法，继承Source类的method1()方法
	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("this is the targetable method!"); 
	}

}
