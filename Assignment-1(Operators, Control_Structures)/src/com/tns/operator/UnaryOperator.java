package com.tns.operator;

import java.util.Scanner;

public class UnaryOperator {

	public static void main(String[] args) 
	{
		
		//int a=5, b=3;
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the Value of A : ");
		int a=s.nextInt();
		
		System.out.println("Enter the Value of B : ");
		int b=s.nextInt();
		
		int x=a++;
		@SuppressWarnings("unused")
		int y=++b;
		int z=a+x;
		System.out.println(z);
		
		int m=a--;
		@SuppressWarnings("unused")
		int n=--b;
		int o=a-m;
		
	
		System.out.println(o);
		
		s.close();
		
	}

}
