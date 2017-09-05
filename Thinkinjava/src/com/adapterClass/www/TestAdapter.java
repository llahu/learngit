package com.adapterClass.www;

public class TestAdapter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Targetable tg=new Adapter();
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
 