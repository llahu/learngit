package com.classyouhand.arraylist;

public class Apple {
	private static long counter;
	private final long id=counter++;
	public long getId(){
		return id;
	}
}
