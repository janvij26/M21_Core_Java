package com.tns.e_n_u_m;

interface Pizza
{
	void display();
}

enum size implements Pizza
{
	Regular, Medium, Large, Extra_Large;
	
	@Override
	public void display()
	{
		System.out.println("Size is: "+this);
	}
}
public class Enum_interface {

	public static void main(String[] args) {
		size.Large.display();

	}

}
