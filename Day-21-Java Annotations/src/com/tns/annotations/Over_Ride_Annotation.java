package com.tns.annotations;

class Car
{
	public void speed(int s)
	{
		System.out.println("Speed is: "+s+"km/hr");
	}
}

class Brezza extends Car
{
	// Override annotations is giving the extra information about the method
	@Override
	public void speed(int str)
	{
		System.out.println("Speed is: "+str+"km/hr");
	}
}

public class Over_Ride_Annotation {

	public static void main(String[] args) 
	{
		Brezza b=new Brezza();
		b.speed(60);
	}

}
