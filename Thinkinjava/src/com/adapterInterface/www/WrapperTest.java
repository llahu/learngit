package com.adapterInterface.www;

public class WrapperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wrapper w1=new SourceSub1();
		w1.method1();
		w1.method2();
		Wrapper w2=new SourceSub2();
		w2.method1();
		w2.method2();
	}

}
