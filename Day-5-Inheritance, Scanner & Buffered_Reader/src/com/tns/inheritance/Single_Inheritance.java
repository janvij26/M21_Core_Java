package com.tns.inheritance;

// Program for Single Inheritance
// Single Inheritance: A Program with only 1 Parent-Class and 1 Child-Class. 
// Child-Class Inherit Properties of Parent-Class.

//Parent-Class
class Bike
{
	public int Speed=50;
	void Speed()
	{
		System.out.println("The Speed of the Bike is: "+Speed+"km/hr");
	}
}
//Inheritance
//Child-Class
class Duke extends Bike
{
	void Color()
	{
	System.out.println("The Color of Duke is White & Orange");
	}
}

public class Single_Inheritance {

	public static void main(String[] args) 
	{
		//Object of Child-Class
		Duke d=new Duke();
		
		//Calling the Methods
		d.Speed();
		d.Color();

	}

}
