package com.singleton.www;

public class singletonTest {
	//持有私有的静态属性，防止被引用。这里设为null是为了延迟加载。
	private static singletonTest instance=null;
	//私有的构造函数，防止被实例化
	private singletonTest(){
		
	}
	
	public static singletonTest getInstance(){
		if(instance==null){
			sltInit();
		}
		return instance;
	}
	//使用同步方法来完成实例的初始化
	public static  synchronized void sltInit() {
		// TODO Auto-generated method stub
		if(instance==null){
			instance=new singletonTest();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		singletonTest slt=singletonTest.getInstance();
		System.out.println(slt);
		
	}

}
