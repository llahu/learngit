package com.wq520.String;

public class OverRideTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Father obj=new Son();
		obj.print();
		obj.printf();
		
		//Father obj1=ne
	}

}

abstract class Father{
	public Father(){
		printf();
	}
	abstract void print();
	public void printf(){
		System.out.println("father printf");
	}
}

class Son extends Father{
	public Son(){
		super();
	}
	@Override
	void print() {
		System.out.println("son print");
		
	}
	public void printf(){
		System.out.println("son printf");
	}
	
}