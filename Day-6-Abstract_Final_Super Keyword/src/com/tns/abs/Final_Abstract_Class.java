package com.tns.abs;
//we can't make any abstract class as final in java
//final abstract class Car
abstract class Car
{
	abstract void display();
	
}
class Audi extends Car
{
	void display()
	{
		System.out.println("Audi");
	}
}
public class Final_Abstract_Class {

	public static void main(String[] args) {
		Audi a=new Audi();
		a.display();

	}

}
