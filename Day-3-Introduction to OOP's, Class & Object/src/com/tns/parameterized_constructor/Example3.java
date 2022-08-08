package com.tns.parameterized_constructor;

import java.util.Scanner;

class C
{
	int roll_no,roll_no1;
	String name,name1;
	
	C(int r,String n)
	{
		roll_no=r;
		roll_no1=r;
		
		name=n;
		name1=n;
	}
	void print()
	{
		System.out.println("The Roll no. is : "+roll_no);
		System.out.println("The Name is : "+name);
	}
}

public class Example3 {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		int roll_no=s.nextInt();
		String name=s.nextLine();
		
		int roll_no1=s.nextInt();
		String name1=s.nextLine();
		
		C c=new C(roll_no,name);
		C c1=new C(roll_no1,name1);
		
		c.print();
		c1.print();

		s.close();
	}

}
