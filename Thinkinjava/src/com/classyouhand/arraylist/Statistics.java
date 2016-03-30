package com.classyouhand.arraylist;

import java.util.*;
import java.util.Random;

public class Statistics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand=new Random(47);
		Map<Integer,Integer> m=new HashMap<Integer,Integer>();
		for (int i = 0; i < 1000; i++) {
			int r=rand.nextInt(20);
			Integer freq=m.get(r);
			m.put(r, freq==null?1:freq+1);
		}
		System.out.println(m);
	}

}
