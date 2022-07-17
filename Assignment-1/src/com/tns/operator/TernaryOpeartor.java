package com.tns.operator;

import java.util.Scanner;

public class TernaryOpeartor {

	public static void main(String[] args) 
	{
		//int a=5, b=2;
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the Value of A : ");
		int a=s.nextInt();
		
		System.out.println("Enter the Value of B : ");
		int b=s.nextInt();
		
		int result_1=(a*b==2)? a:b;
		System.out.println(result_1);
		
		s.close();

	}

}
