package com.mediator.www;
//这是一个抽象的同事类
public abstract class Colleague {
	protected Mediator mediator=null;
	public Colleague(Mediator mediator){
		this.mediator=mediator;
	}
}
