package com.classyouhand.arraylist;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import com.classyouhand.arraylist.pets.*;

public class ListFeature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Random rand=new Random(47);
//		List<Pet> pets=Pets.arrayList(7);
//		System.out.println("1:"+pets);
//		Hamster h=new Hamster();
//		pets.add(h);
//		System.out.println("2:"+pets);
//		System.out.println("3:"+pets.contains(h));
		
		LinkedList<Pet> pets=new LinkedList<Pet>(Pets.arrayList(5));
		System.out.println(pets);
		//identical
		System.out.println("pets.getFirst()："+pets.getFirst());
		System.out.println("pets.element()："+pets.element());
		
		System.out.println("pets.peek():"+pets.peek());
		
		System.out.println("pets.remove()"+pets.remove());
		System.out.println("pets.removeFirst()"+pets.removeFirst());
		System.out.println("pets.poll()"+pets.poll());
		
		pets.addFirst(new Rat());
		System.out.println(pets);
	}

}
