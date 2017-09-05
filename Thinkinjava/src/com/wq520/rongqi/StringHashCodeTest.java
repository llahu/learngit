package com.wq520.rongqi;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class StringHashCodeTest {

	public static <E> void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		String[] str="hello hello".split(" ");
		String str1=new String("hello");
		System.out.println(str[0].hashCode());
		System.out.println(str[1].hashCode());
		System.out.println(str1.hashCode());
		Set<E> set=new HashSet<E>(50);
		*/
		List list=new ArrayList();
		LinkedList link1=new LinkedList(list);
		ArrayList al=new ArrayList();
		LinkedList link2=new LinkedList(al);
	}

}
