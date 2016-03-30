package com.classyouhand.arraylist;

import java.util.ArrayList;

public class AppleAndOrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Apple> al=new ArrayList<Apple>();
		al.add(new Apple());
		al.add(new Apple());
		al.add(new Apple());
		//al.add(new Orange());
		for(int i=0;i<al.size();i++){
			System.out.println(al.get(i).getId());
		}
		for(Apple a:al){
			System.out.println(a.getId());
		}
	}

}
