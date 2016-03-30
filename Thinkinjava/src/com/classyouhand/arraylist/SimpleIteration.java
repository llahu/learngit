package com.classyouhand.arraylist;

import java.util.Iterator;
import java.util.List;

import com.classyouhand.arraylist.pets.Pet;
import com.classyouhand.arraylist.pets.Pets;

public class SimpleIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Pet> pets=Pets.arrayList(12);
		Iterator<Pet> it =pets.iterator();
		while(it.hasNext()){
			Pet p=it.next();
			System.out.println(p.id()+":"+p+" ");
		}
		System.out.println();
		for(Pet p:pets){
			System.out.println(p);
		}
	}

}
