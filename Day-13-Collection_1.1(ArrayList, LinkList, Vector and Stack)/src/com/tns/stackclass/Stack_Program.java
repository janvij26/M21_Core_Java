package com.tns.stackclass;

import java.util.Stack;

public class Stack_Program {

	public static void main(String[] args) 
	{
		Stack s=new Stack();
		// Push Method is used to add the Elements into the Stack
		s.push(11);
		s.push(11);
		s.push("Neha");
		System.out.println(s);
		// Pop Method is used to remove Elements from the Stack
		System.out.println(s.pop());
		System.out.println(s);
		
	

	}

}
