package com.tns.parameterized_constructor;

class B 
{	
		//public int x;
		// Parameterized Constructor
		B(int a)
		{
			System.out.print("The Value of A: "+a);
		}
}

public class Example2 {

	public static void main(String[] args) 
	{
		@SuppressWarnings("unused")
		B b=new B(15);

	}

}
