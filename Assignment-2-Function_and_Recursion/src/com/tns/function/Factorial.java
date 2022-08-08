package com.tns.function;
import java.util.Scanner;

// Program for Finding the Factorial of a number using function.

public class Factorial 
{
	// Function Definition
	static int factorial(int n)
	{
		int fact=1;
		for(int i=1; i<=n; i++)
		{
			fact=fact*i;
		}
		return fact;
	}
	
	public static void main(String args[]) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		// Function Call
		System.out.println(factorial(n));
		s.close();
	}	
}
