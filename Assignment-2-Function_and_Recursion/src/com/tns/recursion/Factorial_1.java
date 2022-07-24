package com.tns.recursion;

import java.util.Scanner;

// Program for Finding the Factorial of a number using recursion.

public class Factorial_1 
{
	// Function Definition
	static int factorial(int n)
	{
		if(n==1)
			return 1;
		else
			return n*factorial(n-1);
	}
	

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		// Function Call
		System.out.println(factorial(n));
		s.close();
	}

}
