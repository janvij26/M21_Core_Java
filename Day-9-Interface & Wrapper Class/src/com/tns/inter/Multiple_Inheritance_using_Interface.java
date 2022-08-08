package com.tns.inter;

interface Mother
{
	void display();
}

interface Father
{
	void print();
}

class Daughter implements Mother,Father
{
	public void display()
	{
		System.out.println("MOTHER");
	}
	
	public void print()
	{
		System.out.println("FATHER");
	}
}
public class Multiple_Inheritance_using_Interface {

	public static void main(String[] args) 
	{
		Daughter d=new Daughter();
		d.display();
		d.print();

	}

}
