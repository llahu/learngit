package com.strategy.www;
//这是一个抽象辅助类，用于对输入的运算表达式进行分隔
public abstract class AbstractCalculator {
	public int[] splite(String exp,String opt){
		String[] strArray=exp.split(opt);//对表达式进行分隔
		int n=strArray.length;//获取操作数的个数
		int[] intArray=new int[n];
		for (int i = 0; i < n; i++) {
			intArray[i]=Integer.parseInt(strArray[i]);
		}
		return intArray;
		
	}
}
