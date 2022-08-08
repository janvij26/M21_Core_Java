package com.tns.parameterized_constructor;

class Student
{
	int x;
	String name;
	Student(int x, String name)
	{
		this.x=x;
		this.name=name;
		System.out.println("The Roll no. is : "+x);
		System.out.println("The Name is : "+name);
	}
}

public class Example4_declaration_in_Constructor {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Student student=new Student(21,"Siddhant") ;

	}

}
