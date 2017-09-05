package com.strategy.www;

public class Plus extends AbstractCalculator implements ICalculator {

	@Override
	public int calculate(String exp) {
		// TODO Auto-generated method stub
		int[] intArray=splite(exp, "\\+");//将所有的操作数存储起来
		int sum=0;
		for (int i = 0; i < intArray.length; i++) {
			sum+=intArray[i];
		}
		return sum;
	}


}
