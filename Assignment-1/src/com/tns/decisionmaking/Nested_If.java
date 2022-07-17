package com.tns.decisionmaking;

import java.util.Scanner;

public class Nested_If {

	public static void main(String[] args)
	{
		//int age=15, weight=130;
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the Age of Person : ");
		int age=s.nextInt();
		
		System.out.println("Enter the Weight of Person : ");
		int weight=s.nextInt();
		
		s.close();
		
		if(age>=12)
		{
			if(weight>=40)
			{
				if(weight<=110)
				{
					System.out.println("Eligible for bunjee jumping");
				}
				else
				{
					System.out.println("Extra ropes will be added");
				}
			}	
			else
				{
					System.out.println("Not Eligebile for bunjee jumping");
				}
		}
		else
				{
				System.out.println("Not Eligebile for bunjee jumping");
				}
			
		}	
}
