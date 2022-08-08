package com.tns.abs;
abstract class A
{
	void print()
	{
		System.out.println("Non-abstract method");
	}
}
class B extends A
{
	/*void display()
	{
		
		System.out.println("Child class-B");
		//super.print();
	}*/
	//As B is inheriting the properties of A class then it has print method
}
public class Non_Abstract_Method {

	public static void main(String[] args) {
		B a=new B();
		a.print();
		//a.display();
		

	}

}