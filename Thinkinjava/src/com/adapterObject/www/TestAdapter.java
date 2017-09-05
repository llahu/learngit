package com.adapterObject.www;

public class TestAdapter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//定义一个Source类
		Source s=new Source();
		//定义一个接口，但是使用adapter类定义
		Targetable tg=new Adapter(s);
		tg.method1();
		tg.method2();
	}

}
/*
 output:
this is Source methods
this is the targetable method!
注意Tagetable接口的实现类具有Source类的功能
 */
 