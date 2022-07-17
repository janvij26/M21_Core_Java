package com.tns.operator;

import java.util.Scanner;

public class ArithemeticOperator 
{

	public static void main(String[] args) 
	{
		//int a=15, b=26;
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the Value of A : ");
		int a=s.nextInt();
		
		System.out.println("Enter the Value of B : ");
		int b=s.nextInt();
		
		int result_1=a+b;
		System.out.println("The Addition of A and B is : "+result_1);
		
		int result_2=a-b;
		System.out.println("The Substraction of A and B is : "+result_2);
		
		int result_3=a*b;
		System.out.println("The Multiplication of A and B is : "+result_3);
		
		int result_4=a/b;
		System.out.println("The Division of A and B is : "+result_4);
		
		int result_5=a%b;
		System.out.println("The Mod of A and B is : "+result_5);
			
		s.close();
	}

}
