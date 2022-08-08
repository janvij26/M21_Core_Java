package com.tns.polymorphism;

// Program for Method Overridding 
// Example 2

class Parent
{
	void child_1()
	{
	 System.out.println("This is the Parent Class");	
	}
}

public class Method_OverRiding_1 extends Parent
{
	void child_1()
	{
	 System.out.println("This is the First Child of Main Class ");
	}
	
	void child_2()
	{
		System.out.println("This is the Second Child of Main Class");
	}

	public static void main(String args[])
	{
		Parent p=new Method_OverRiding_1();
		p.child_1();
		Method_OverRiding_1 m=new Method_OverRiding_1();
		m.child_2();
	}
}



