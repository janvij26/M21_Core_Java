package com.cg.parameterized_constructor;

class B 
{	
		public int x;
		// Parameterized Constructor
		B(int a)
		{
			System.out.print("The Value of A: "+a);
		}
}

public class Example2 {

	public static void main(String[] args) 
	{
		B obj=new B(20);

	}

}
