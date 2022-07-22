package com.tns.inter;

interface Vehicle
{ 
	//Abstract Method
	void speed();
}

// When we use two interface and we are going to access one interface from another interface
//then always use extends keyword
interface Car extends Vehicle
{
	void engine();
	
}

class Bus implements Car
{
	public void engine()
	{
		System.out.println("Petrol");
	}
	
	public void speed()
	{
		System.out.println("Speed is 50km/hr");
	}
}
public class Main_two_Interface {

	public static void main(String[] args) {
		Bus b=new Bus();
		b.engine();
		b.speed();

	}

}
