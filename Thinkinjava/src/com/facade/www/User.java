package com.facade.www;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer computer=new Computer();
		computer.startup();
		System.out.println("啦啦啦，有电脑真好");
		computer.shutdown();
	}

}
