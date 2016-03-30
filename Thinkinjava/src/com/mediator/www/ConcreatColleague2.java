package com.mediator.www;

public class ConcreatColleague2 extends Colleague {

	public ConcreatColleague2(Mediator mediator) {
		super(mediator);
		// TODO Auto-generated constructor stub
	}
	//自有的方法
	public void selfMethod2(){
		//处理自己的业务
	}
	//依赖方法
	public void depMethod2(){
		//处理自己的业务逻辑
		//自己不能处理的，就委托给中介者处理
	}
}
