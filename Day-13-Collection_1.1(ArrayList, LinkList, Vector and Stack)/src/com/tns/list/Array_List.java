package com.tns.list;

import java.util.ArrayList;

public class Array_List {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		// Declare the ArrayList from Collection Class
		//ArrayList<Object> obj=new ArrayList<>();
		@SuppressWarnings("rawtypes")
		ArrayList obj=new ArrayList();
		obj.add("Siddhant");
		obj.add("Rajiagre");
		obj.add("512");
		
		System.out.println("ArrayList Elements are: "+obj);
		// Size of the Array
		System.out.println("The Size of ArrayList is: "+obj.size());
		System.out.println(obj.contains(512));
		System.out.println(obj.indexOf(512));
		System.out.println(obj.lastIndexOf("Siddhant"));
	}

}
