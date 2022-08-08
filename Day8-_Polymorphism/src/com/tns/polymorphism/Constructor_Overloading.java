package com.tns.polymorphism;

// Program on Constructor Overloading

class Triber
{
	int speed;
	String engine;
	// Zero Parameter
	Triber()
	{
		System.out.println("Renault-kiger");
	}
	
	// Two Parameters
	Triber(int speed, String engine)
	{
		this.speed=speed;
		this.engine=engine;
		System.out.println("The Speed is: "+speed+"km/hr and the engine is : "+engine);
		
	}
}
public class Constructor_Overloading {

	public static void main(String[] args) 
	{
		@SuppressWarnings("unused")
		Triber t=new Triber();
		@SuppressWarnings("unused")
		Triber t1=new Triber(45,"Disel");

	}

}
