package com.tns.generics;
// Generic Class
public class Generic_Class<T> {
	// T is a type
	T obj;
	public void display()
	{
		System.out.println(obj.getClass().getName());
	}
	
	public static void main(String[] args) 
	{
		// Generic Advantage
		Generic_Class<Integer>obj1=new Generic_Class<Integer>();
		obj1.obj=15;
		obj1.display();
		
	
		
		

	}

}
