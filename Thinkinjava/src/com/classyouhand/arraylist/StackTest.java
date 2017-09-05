package com.classyouhand.arraylist;

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack=new Stack<String>();
		for(String s: "qwq ere rtg rewr rtf".split(" ")){
			stack.push(s);
		}
		while(!stack.empty()){
			System.out.print(stack.pop()+" ");
		}
	}

}
