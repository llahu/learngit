package com.wq520.rongqi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class StringAddress1{
	private String s;

	public StringAddress1(String s) {
	
		this.s = s;
	}

	@Override
	public String toString() {
		return super.toString() + s ;
	}
	
}
public class FillList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<StringAddress1> list=new ArrayList<StringAddress1>(
				Collections.nCopies(4, new StringAddress1("hello")));
		System.out.println(list);
		Collections.fill(list, new StringAddress1("world"));
		System.out.println(list);
	}

}
