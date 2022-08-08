package com.tns.super_keyword;
//Super keyword:- it is used to invoke parent class constructor
class Flower
{
	Flower()
	{
		System.out.println("Flower");
	}
}
class Rose extends Flower
{
	Rose()
	{
		//we are invoking parent class constructor
		//first give the preference to constructor call and then print the statement.
		super();
		System.out.println("Rose is Red");
	}
}
class Lily extends Flower
{
	Lily()
	{
		super();
		System.out.println("Lily");
	}
}
public class Super_Constructor {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Rose r=new Rose();
		@SuppressWarnings("unused")
		Lily r1=new Lily();


	}

}