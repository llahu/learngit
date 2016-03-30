package com.classyouhand.arraylist;

import java.util.List;
import java.util.ListIterator;

import com.classyouhand.arraylist.pets.Pet;
import com.classyouhand.arraylist.pets.Pets;

public class ListIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Pet> pets=Pets.arrayList(8);
		ListIterator<Pet> li=pets.listIterator();
		while(li.hasNext()){
			System.out.println(li.next()+","+li.nextIndex()+","
					+li.previousIndex()+";");
		}
		ListIterator<Pet> it=pets.listIterator(4);
		while(it.hasNext()){
			it.next();
			it.set(Pets.randomPet());
		}
		System.out.println(pets);
		
	}

}
