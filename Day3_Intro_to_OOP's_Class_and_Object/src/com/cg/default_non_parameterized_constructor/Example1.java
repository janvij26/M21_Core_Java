package com.cg.default_non_parameterized_constructor;

class A
{
	//Non-Parameterized Constructor
	A()
	{
		System.out.println("Hey There, I am using Non-Parametrized Constructor");
	}
}

public class Example1 {

	public static void main(String[] args) {
		// Creation of an object
		A a=new A();
	}
}
