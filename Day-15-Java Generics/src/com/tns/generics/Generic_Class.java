package com.tns.generics;
//Generic Class
public class Generic_Class<T>{
	//T is a type
	T num;
	public void display()
	{
		System.out.println(num.getClass().getName());
	}

	public static void main(String[] args) {
		Generic_Class<Character>obj=new Generic_Class<Character>();//generics advantage
		obj.num='z';
		obj.display();

	}

}