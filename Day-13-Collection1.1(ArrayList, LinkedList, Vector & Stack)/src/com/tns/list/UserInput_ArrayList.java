package com.tns.list;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInput_ArrayList {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		System.out.println(str);
		
		@SuppressWarnings("resource")
		Scanner token=new Scanner(str);
		token.useDelimiter(" ");
		// USer-Input ArrayList
		ArrayList<Object>arr=new ArrayList<Object>();
		// To 
		while(token.hasNext())
		{
			arr.add(token.next());
			System.out.println(arr.get(arr.size()-1));
		}
		System.out.println(arr);
		s.close();
	}
}
