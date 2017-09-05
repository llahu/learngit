package com.singleton.www;

import java.util.*;

//这个例子将展示如何只生成3个对象的单例模式
public class Emperor {
	private Emperor(){
		
	}
	private Emperor(String string) {
		// TODO Auto-generated constructor stub
		nameList.add(string);//传入皇帝名称，建立一个皇帝对象
	}
	private final static int maxNum=3;
	//每个皇帝都有名字，使用ArrayList来存储
	private static ArrayList<String> nameList=new ArrayList<String>();
	//定义一个列表用来存储皇帝对象
	private static ArrayList<Emperor> emperorList=new ArrayList<Emperor>();
	//设置当前的皇帝的序列号
	private static int countNumOfEmperor=0;
	static{
		for (int i = 0; i < maxNum; i++) {
			emperorList.add(new Emperor("皇"+(i+1)+"帝"));
		}
	}
	//随机的获取一个皇帝的对象
	public static Emperor getInstance(){
		Random random=new Random();
		//随机的拉出一个皇帝
		countNumOfEmperor=random.nextInt(maxNum);
		return emperorList.get(countNumOfEmperor);//在对象的列表中获取指定索引的对象	
	}
	//皇帝发话了
	public static void say(){
		System.out.println(nameList.get(countNumOfEmperor));
	}
}
