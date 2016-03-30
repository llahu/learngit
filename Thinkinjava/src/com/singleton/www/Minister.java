package com.singleton.www;

public class Minister {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//定义有5个大臣
		int ministerNum=5;
		for (int i = 0; i <ministerNum ; i++) {
			Emperor emperor=Emperor.getInstance();
			System.out.println("这是第"+(i+1)+"个大臣在参拜的是：");
			emperor.say();
		}
	}

}
