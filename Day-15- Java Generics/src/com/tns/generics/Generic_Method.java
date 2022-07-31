package com.tns.generics;

public class Generic_Method {

	public static void main(String[] args) {
		Integer arr[]= {15,26,12};
		Character ch[]= {'S','J','r'};
		System.out.println("Integer Array: ");
		print(arr);
		
		System.out.println("Character Array: ");
		print(ch);
	}	
		// Generic Method: We can pass any type of Arguments
		// E is the element
		public static <E> void print(E[] elements)
		{
			for(E elem:elements)
			{
				System.out.println(elem);
			}
			System.out.println();
		}
}