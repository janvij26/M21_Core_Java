package com.tns.inter;

interface inf
{
	// By default it's Abstract Method
	void display();

}

class Demo implements inf
{
	// Provided the implementation for abstract method inside the Demo Class
	
	@Override
	public void display()
	{
		System.out.println("Interface");
	}
}
	



class Main {

	public static void main(String[] args) 
	{
		Demo d=new Demo();
		d.display();

	}

}
