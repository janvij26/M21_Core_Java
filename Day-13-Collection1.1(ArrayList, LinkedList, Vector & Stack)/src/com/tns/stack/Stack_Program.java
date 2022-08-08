package com.tns.stack;

import java.util.Stack;

public class Stack_Program {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		@SuppressWarnings("rawtypes")
		Stack s=new Stack();
		s.push(11);
		s.push(11);
		s.push("Neha");
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s);

	}
	
}
