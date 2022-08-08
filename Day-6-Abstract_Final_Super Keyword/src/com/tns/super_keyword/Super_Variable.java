package com.tns.super_keyword;
//Super keyword:- it is used to access parent class instance variable
class Mobile
{
	protected String name="Samsung";
	
}

class Samsung extends Mobile
{
	String name="Galaxy M31s";
	void display()
	{
		System.out.println(name);
		System.out.println(super.name);

	}
}
public class Super_Variable {

	public static void main(String[] args) {
		Samsung s=new Samsung();
		s.display();
		
	}

}
