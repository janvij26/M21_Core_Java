package com.tns.generics;

import java.util.LinkedList;
import java.util.List;

public class Generic_Class3 {

	public static void main(String[] args) {
		List<Integer>obj=new LinkedList<Integer>();
		obj.add(11);
		obj.add(12);
		//1/3.Compile-Time checking and type safe
		//obj.add("12");
		
		System.out.println(obj);
		//2.Type-casting is not required in Generics
		List<String>obj1=new LinkedList<String>();
		//List obj1=new LinkedList();
		obj1.add("Ashlesha");
		obj1.add("Siddhi");
		String str=obj1.get(1);
		//type-casting explicitly if there is not an object -type
		//String str1=(String)obj1.get(1);
		System.out.println(str);

	}

}