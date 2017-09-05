package com.factoryTosingleton.www;

import java.lang.reflect.Constructor;

//负责生成单例的工厂类
public class SingletonFactory {
	private static Singleton  singleton=null;
	static{
		try{
			Class cl=Class.forName(Singleton.class.getName());
			//获得无参的构造函数
			Constructor constructor=cl.getConstructor();
			//设置无参构造是可访问的
			constructor.setAccessible(true);
			//产生一个实例对象
			singleton=(Singleton)constructor.newInstance();
		}catch(Exception e){
			
		}
	}
	public static Singleton getInstance(){
		return singleton;//返回实例对象
	}
}
