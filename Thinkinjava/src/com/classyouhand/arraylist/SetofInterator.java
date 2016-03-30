package com.classyouhand.arraylist;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetofInterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand=new Random(47);
		Set<Integer> inset=new HashSet<Integer>();
		for(int i=0;i<10000;i++){
			inset.add(rand.nextInt(30));
		}
		System.out.println(inset);
		Set<String> set1=new HashSet<String>();
		Collections.addAll(set1, "q we e t yy y u i".split(" "));
		set1.add("M");
		System.out.println(set1);
	}

}
