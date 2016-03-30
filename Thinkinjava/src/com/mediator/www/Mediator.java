package com.mediator.www;
//这是一个通用的抽象中介者类。主要用来测试中介者模式
public abstract class Mediator {
	//定义同事类
	protected ConcreatColleague1 c1;
	protected ConcreatColleague2 c2;
	//通过get和set的方法来把同事类给注入进来
	public ConcreatColleague1 getC1() {
		return c1;
	}
	public void setC1(ConcreatColleague1 c1) {
		this.c1 = c1;
	}
	public ConcreatColleague2 getC2() {
		return c2;
	}
	public void setC2(ConcreatColleague2 c2) {
		this.c2 = c2;
	}
	
	//中介者模式的业务处理
	public abstract void doSomething1();
	public abstract void doSomething2();
}
