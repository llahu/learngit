package com.builder.www;

import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Builder bd=new Builder();
		bd.produceEmail(3);
		bd.produceMessage(4);
		Iterator<sender> it=bd.lsend.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
