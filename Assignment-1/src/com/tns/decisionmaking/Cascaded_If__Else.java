package com.tns.decisionmaking;

import java.util.Scanner;

public class Cascaded_If__Else {

	public static void main(String[] args)
	{
		//int a=11, b=7, c=23;
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the Value of A : ");
		int a=s.nextInt();
		
		System.out.println("Enter the Value of B : ");
		int b=s.nextInt();
		
		System.out.println("Enter the Value of C : ");
		int c=s.nextInt();
		
		s.close();
		
		if(a>b && a>c)
		{
			System.out.println("The IF Condition is TRUE.");
		}
		else if(b>a && b>c)
		{
			System.out.println("The ELSE IF Condition is TRUE.");
		}
		else
		{
			System.out.println("The IF and ELSE IF Conditions are FAlSE.");
		}

	}

}
