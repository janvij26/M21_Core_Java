package com.tns.array;

import java.util.*;

public class RunTime_Array {

	public static void main(String[] args) 
	{
		int arr[]=new int [5];
	
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Array Value : ");
		
	
		// To Enter the Elements the Array
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter " +i+"th Value : ");
			arr[i]=s.nextInt();
		}
		
		//To Print the array value that we gave as input
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
		s.close();
	}

}
