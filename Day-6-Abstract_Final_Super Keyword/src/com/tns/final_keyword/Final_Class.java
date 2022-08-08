package com.tns.final_keyword;
//we can't extend final class
//final class Vehicle
class Vehicle
{
	void display()
	{
		System.out.println("Vehicle Type");
	}
}
class Bike extends Vehicle
{
	void print()
	{
		System.out.println("Bike");

	}
}
public class Final_Class {

	public static void main(String[] args) {
		Bike b=new Bike();
		b.print();
		b.display();

	}

}
