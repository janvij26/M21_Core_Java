package com.tns.polymorphism;

// Program for Method Over-Ridding

// One class is not enough so, create two or more class which contains Inheritance Concept

class Multiplication
{
	void accept(int a, int b)
	{
		System.out.println(a*b);
	}
}

class Mult extends Multiplication
{
	void accept(float x, float y)
	{
		System.out.println(x*y);
	}
}

public class Method_Overriding 
{
	public static void main(String[] args)
	{
		Mult m=new Mult();
		m.accept(12, 5);
		
		Multiplication m1=new Multiplication();
		m1.accept(4, 6);
	}

}
