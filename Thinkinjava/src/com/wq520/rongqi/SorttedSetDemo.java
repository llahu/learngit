package com.wq520.rongqi;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SorttedSetDemo implements Comparator<String>{
	  public static void main(String[] args) {
	    SortedSet<String> sortedSet = new TreeSet<String>();
	    Collections.addAll(sortedSet,
	      "one two three four five six seven eight"
	        .split(" "));
	   // System.out.println
	    System.out.println(sortedSet);
	    String low = sortedSet.first();
	    String high = sortedSet.last();
	    System.out.println(low);
	    System.out.println(high);
	    Iterator<String> it = sortedSet.iterator();
	    for(int i = 0; i <= 6; i++) {
	      if(i == 3) low = it.next();
	      if(i == 6) high = it.next();
	      else it.next();
	    }
	    System.out.println(low);
	    System.out.println(high);
	    System.out.println(sortedSet.subSet(low, high));
	    System.out.println(sortedSet.headSet(high));
	    System.out.println(sortedSet.tailSet(low));
	  }

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o1.compareTo(o2);
	}
	} 