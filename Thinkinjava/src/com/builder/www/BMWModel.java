package com.builder.www;

public class BMWModel extends CarModel {

	@Override
	protected void start() {
		// TODO Auto-generated method stub
		System.out.println("宝马是这样启动的");
	}

	@Override
	protected void stop() {
		// TODO Auto-generated method stub
		System.out.println("宝马是这样停止的");
	}

	@Override
	protected void alarm() {
		// TODO Auto-generated method stub
		System.out.println("宝马是这样按喇叭的");
	}

	@Override
	protected void engineBoom() {
		// TODO Auto-generated method stub
		System.out.println("宝马的引擎声是这样的");
	}

}
