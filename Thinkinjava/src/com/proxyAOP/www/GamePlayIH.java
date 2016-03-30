package com.proxyAOP.www;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

//动态的代理类
public class GamePlayIH implements InvocationHandler {
	//被代理者
	Class cls=null;

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// TODO Auto-generated method stub
		Object result=method.invoke(proxy, args);
		return null;
	}
	//被代理的实例
	Object obj=null;
	//我要代理谁啊,在构造函数中确定被代理者
	public GamePlayIH(Object obj){
		this.obj=obj;
	}

}
