package com.mediator.www;

public class ConcreatMediator extends Mediator {

	@Override
	public void doSomething1() {
		// TODO Auto-generated method stub
		//调用同事类的方法，来处理事情
		super.c1.selfMethod1();
		super.c2.selfMethod2();
	}

	@Override
	public void doSomething2() {
		// TODO Auto-generated method stub
		super.c1.selfMethod1();
		super.c2.selfMethod2();
	}

}
