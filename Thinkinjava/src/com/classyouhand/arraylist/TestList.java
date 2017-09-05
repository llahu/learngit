package com.classyouhand.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class IDClass{
	private static int counter;
	private final int count=counter++;
	public String toString(){
		return "IDClass"+count;
	}
}
public class TestList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IDClass[] idc=new IDClass[10];
		for(int i=0;i<idc.length;i++){
			idc[i] =new IDClass();
		}
		List<IDClass> lst=new ArrayList<IDClass>(
				Arrays.asList(idc));
		System.out.println("lst="+lst);
		List<IDClass> subset=lst.subList(lst.size()/4,
				lst.size()/2);
		System.out.println("subset"+subset);
		lst.removeAll(subset);
		System.out.println("lst:"+lst);
//		subset.clear();
//		System.out.println("subset"+subset);
	}
 }
