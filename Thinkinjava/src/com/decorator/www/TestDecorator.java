package com.decorator.www;

public class TestDecorator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Source  s=new Source();
		Sourable dec=new Decorator(s);
		dec.method();
	}

}
