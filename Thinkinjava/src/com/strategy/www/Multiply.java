package com.strategy.www;

public class Multiply extends AbstractCalculator implements ICalculator {

	@Override
	public int calculate(String exp) {
		// TODO Auto-generated method stub
		int[] intArray=splite(exp,"\\*");
		int sum=1;
		for (int i = 0; i < intArray.length; i++) {
			sum*=intArray[i];
		}
		return sum;
	}

}
