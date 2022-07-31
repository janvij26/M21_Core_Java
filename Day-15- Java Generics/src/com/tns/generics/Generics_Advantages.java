package com.tns.generics;

import java.util.LinkedList;
import java.util.List;

public class Generics_Advantages {

	public static void main(String[] args) 
	{
		List<Integer>obj=new LinkedList<Integer>();
		obj.add(15);
		obj.add(26);
		// 1.COmpile-Time Checking and Type Safe
		//l.add("26");
		System.out.println(obj);
		
		// 2. Type-Casting is not allowed in Generics 
		List<String>obj1=new LinkedList<String>();
		//List obj1=new LinkedList ();
		obj1.add("Janvi");
		obj1.add("Siddhant");
		String str=obj1.get(1);
		// Type-Casting Explicitly if there is not an object type
		// String str1=(String)obj1.get(1);
		System.out.println(str);
	}

}
