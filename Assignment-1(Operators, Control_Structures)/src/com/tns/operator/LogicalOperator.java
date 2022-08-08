package com.tns.operator;

import java.util.Scanner;

public class LogicalOperator {

	public static void main(String[] args)
	{
		//int a=3, b=4;
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the Value of A : ");
		int a=s.nextInt();
		
		System.out.println("Enter the Value of B : ");
		int b=s.nextInt();
		
		boolean result_1=(a>=15 && b>=26);
		System.out.println("The result of Logical AND Operator is : "+result_1);
		
		boolean result_2=(a<b || b>65);
		System.out.println("The result of Logical OR Operator is : "+result_2);

		boolean result_3= !(a<b);
		System.out.println("The result of Logical NOT Operator is : "+result_3);
		
		s.close();
	}

}
