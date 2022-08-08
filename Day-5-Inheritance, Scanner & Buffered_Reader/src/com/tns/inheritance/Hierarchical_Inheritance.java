package com.tns.inheritance;

// Program for Hierarchical Inheritance
// Hierarchical Inheritance: One or more than one Child-Classes are Derived from One Parent-Class.
// A Program with more than 1 Child-Classes.

// Parent-Class
class MobileBrand
{
	void displayName()
	{
		System.out.println("Brand is Iphone");
	}
}

// Child-Class_1
class Iphone13Pro extends MobileBrand
{
	void display()
	{
		System.out.println("Iphone 13 Pro");
	}
}

//Child-Class_2
class Iphone13ProMax extends MobileBrand
{
	void display1()
	{
		System.out.println("Iphone 13 Pro Max");
	}
}

public class Hierarchical_Inheritance {

	public static void main(String[] args) 
	{
		Iphone13Pro a=new Iphone13Pro();
		a.displayName();
		a.display();
		
		Iphone13ProMax b=new Iphone13ProMax();
		b.display1();

	}

}
