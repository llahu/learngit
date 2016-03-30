package com.bridge.www;

public class TestBridge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sourceable source1=new SourceSub1();
		Sourceable source2=new SourceSub2();
		MyBridge mybridge1=new MyBridge(source1);
		mybridge1.method();
		MyBridge mybridge2=new MyBridge(source2);
		mybridge2.method();
	}

}
