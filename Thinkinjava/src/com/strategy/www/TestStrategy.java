package com.strategy.www;
//测试代码
public class TestStrategy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ICalculator plus=new Plus();//这是一个加法接口的实例化对象
		ICalculator minus=new Minus();//这是一个减法接口的实例化对象
		ICalculator multi=new Multiply();//这是乘法接口的实例化对象
		int p=plus.calculate("1+2+3+4");
		System.out.println("plus的结果是:"+p);
		int min=minus.calculate("1-2-3-4-5");
		System.out.println("minus的结果是:"+min);
		int mul=multi.calculate("1*2*23*3");
		System.out.println("multi的结果是："+mul);
	}

}
