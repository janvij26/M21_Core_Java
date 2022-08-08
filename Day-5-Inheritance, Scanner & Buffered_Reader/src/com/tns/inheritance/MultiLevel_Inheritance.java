package com.tns.inheritance;

// Program on Multi-Level Inheritance
// Multi-Level Inheritance: A Class is Derived from a Class which is Derived from another Class.
// A Program with more than 1 Parent-Classes.

//Parent-Class 1
class Vehicle
{	
	public String Type="Car";
	void Vehicle_Type()
	{
		System.out.println("The Vehilcle type is: "+Type);
	}
}

// Parent-Class 2
class Car extends Vehicle
{	
	public String Brand="Suzuki";
	void Model()
	{
		System.out.println("The Brand of Car is: "+Brand);
	}
}

// Child Class
class Brezza extends Car
{
	public String Name="Brezza";
	void Model_Is()
	{
		System.out.println("The Name of Model of Brand Suzuki is: "+Name);
	}
	
}

public class MultiLevel_Inheritance {

	public static void main(String[] args) 
	{	
		// Object of Child-Class
		Brezza b=new Brezza();

		// Calling the Methods
		b.Vehicle_Type();
		b.Model();
		b.Model_Is();

	}

}
