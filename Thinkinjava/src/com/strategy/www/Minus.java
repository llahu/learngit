package com.strategy.www;

public class Minus extends AbstractCalculator implements ICalculator {

	@Override
	public int calculate(String exp) {
		// TODO Auto-generated method stub
		int[] intArray=splite(exp, "-");
		int n=intArray.length;
		int sum=0;
		for (int i = 0; i < n; i++) {
			sum-=intArray[i];
		}
		return sum;
	}

}
