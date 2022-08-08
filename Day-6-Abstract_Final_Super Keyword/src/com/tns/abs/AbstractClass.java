package com.tns.abs;

// Program for Abstract Class
abstract class Fruit
{
	//abstract method
	abstract void display();
}
class Apple
{ 
	// provide implementation for abstract method
	void display()
	{
		System.out.println("Apple is Good for our Brain");
	}
}

public class AbstractClass {

	public static void main(String[] args) {
		//we can't create the obj.for abstract class
		//Fruit f=new Fruit();
		//Fruit f=new Apple();
		Apple f=new Apple();
		f.display();
	}
}
