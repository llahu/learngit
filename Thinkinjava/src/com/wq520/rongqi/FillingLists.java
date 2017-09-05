package com.wq520.rongqi;

import java.util.*;

class StringAddress implements Comparable{
	private String s;

	public StringAddress(String s) {
		this.s = s;
	}
	@Override
	public String toString() {
		return "StringAddress [s=" + s + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((s == null) ? 0 : s.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StringAddress other = (StringAddress) obj;
		if (s == null) {
			if (other.s != null)
				return false;
		} else if (!s.equals(other.s))
			return false;
		return true;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

public class FillingLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<StringAddress> list =new ArrayList<StringAddress>(
				Collections.nCopies(4, new StringAddress("hello")) );
		System.out.println(list);
		Collections.fill(list,new StringAddress("world"));//fill只能替换已近在list中存在的元素
		System.out.println(list);
	}

}
