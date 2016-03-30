package com.classyouhand.arraylist;

import java.util.*;

import com.classyouhand.arraylist.pets.*;

public class PetMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Pet> m=new HashMap<String, Pet>();
		m.put("my cat", new Cat("xiaomi"));
		m.put("my dog", new Dog("小虎"));
		m.put("my hamster", new Hamster("huahua"));
		System.out.println(m);
		Pet dog=m.get("my dog");
		System.out.println(dog);
		System.out.println(m.containsKey("my cat"));
		System.out.println(m.keySet());
		System.out.println(m.values());
		
	}

}
