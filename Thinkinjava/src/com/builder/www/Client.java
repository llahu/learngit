package com.builder.www;

import java.util.ArrayList;

//这里模拟一下奔驰的模型
public class Client {
	public static void main(String[] args){
		/*
		//客户现在需要这样一个模型的车子，我就必须按照客户的要求去设计
		BenzModel benz=new BenzModel();
		//存放在run的顺序
		ArrayList<String> squeuen=new ArrayList<String>();
		squeuen.add("engine boom");
		squeuen.add("start");
		squeuen.add("alarm");
		squeuen.add("stop");
		//现在我们按顺序来造奔驰车
		benz.setSequeuen(squeuen);
		benz.run();
		*/
		//存放在run的顺序
		ArrayList<String> squeuen=new ArrayList<String>();
		squeuen.add("engine boom");
		squeuen.add("start");
		
		squeuen.add("stop");
		//组装一个benz
		BenzBuilder benzbuilder=new BenzBuilder();
		//把顺序给Builder类，让他组装一个benz车
		benzbuilder.setSequeuence(squeuen);
		BenzModel benz=(BenzModel)benzbuilder.getCarModel();
		benz.run();
	}
}
