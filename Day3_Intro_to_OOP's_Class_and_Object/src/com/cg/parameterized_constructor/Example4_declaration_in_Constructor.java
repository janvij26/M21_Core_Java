package com.cg.parameterized_constructor;

class Student
{
	int x;
	String name;
	Student(int x, String name)
	{
		x=x;
		name=name;
		System.out.println("The Roll no. is : "+x);
		System.out.println("The Name is : "+name);
	}
}

public class Example4_declaration_in_Constructor {

	public static void main(String[] args) {
		Student student=new Student(21,"Siddhant") ;

	}

}
