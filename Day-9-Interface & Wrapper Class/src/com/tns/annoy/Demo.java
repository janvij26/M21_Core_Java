package com.tns.annoy;
// Annonymus Class
abstract class Vehicle
{
	public abstract void display();
}

public class Demo {

	public static void main(String[] args) 
	{
		Vehicle v=new Vehicle()
		{
			public void display()
			{
				System.out.println("This is the Annonymus Class");
			}
		};
		v.display();
	}
				
}
