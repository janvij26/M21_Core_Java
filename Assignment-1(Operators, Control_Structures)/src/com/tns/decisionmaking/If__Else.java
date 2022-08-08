package com.tns.decisionmaking;

import java.util.Scanner;

public class If__Else {

	public static void main(String[] args)
	{
		//int a=11, b=7;
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the Value of A : ");
		int a=s.nextInt();
		
		System.out.println("Enter the Value of B : ");
		int b=s.nextInt();
		
		s.close();
		
		if(a>b)
		{
			System.out.println("The Value of A is Greater than B.");
		}
		
		else
		{
			System.out.println("The Value of B is Greater than A.");
		}

	}
	
}
