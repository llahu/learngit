package com.factory.www;
//这是一个场景类，用于测试工厂模式
public class Nvwa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//首先声明一个阴阳八卦炉
		AbstractHumanFactory YYLu=new HumanFactory();
		//女娲开始造人
		System.out.println("造一批白人");
		Human white=YYLu.createHuman(WhiteHuman.class);
		white.getColor();
		white.talk();
		
		System.out.println("造一批黑人");
		Human black=YYLu.createHuman(BlackHuman.class);
		black.getColor();
		black.talk();
		
		System.out.println("造一批黄人");
		Human yellow=YYLu.createHuman(YellowHuman.class);
		yellow.getColor();
		yellow.talk();
	}

}
