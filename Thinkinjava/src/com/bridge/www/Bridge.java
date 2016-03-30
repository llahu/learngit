package com.bridge.www;

public class Bridge {
	private Sourceable source;
	public Bridge(Sourceable source){
		this.source=source;  //进行初始化
	}
	public void method(){
		source.method();//这里实际上会涉及到对象的多态性。不同的source会各自调用自己的method方法。
	}
}
