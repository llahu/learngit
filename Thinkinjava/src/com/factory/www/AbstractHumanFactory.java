package com.factory.www;
//定义一个抽象的人类创建工厂类
public abstract class AbstractHumanFactory {
	public abstract <T extends Human> T createHuman(Class<T> c);
}
