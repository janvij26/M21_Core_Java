package com.tns.polymorphism;

// Program of Compile-Time Polymorphism 

class A
{
	// By having the Different Types of Arguments
	void add(int a, int b)
	{
		System.out.println(a+b);
	}
	
	void add(float a, float b)
	{
		System.out.println(a+b);
	}
}

public class Compile_Time {

	public static void main(String[] args) 
	{
		A o=new A();
		o.add(2, 5);
		o.add(3.0f,4.2f);
	}
}
