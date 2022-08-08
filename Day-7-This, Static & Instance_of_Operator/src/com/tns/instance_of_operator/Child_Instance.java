package com.tns.instance_of_operator;

class A
{
	
}
public class Child_Instance extends A {

	public static void main(String[] args) {
		
		Child_Instance c=new Child_Instance();
		// c is the obj of parent class"A" because "ChildInstance" class accessing the "A" class
		System.out.println(c instanceof A);
		System.out.println(c instanceof Child_Instance );

	}

}