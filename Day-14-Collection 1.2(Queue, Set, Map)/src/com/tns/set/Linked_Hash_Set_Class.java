package com.tns.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class Linked_Hash_Set_Class {

	public static void main(String[] args) {
		Set<Object>obj=new LinkedHashSet<Object>();
		obj.add("Janvi");
		obj.add(15);
		obj.add(15.26);
		System.out.println(obj);
		// To extract the elements of a set separately
		Object[] arr=obj.toArray();
		/*for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
			
		}*/
		// Enhanced for loop
		// If all the elements we added is heterogenous then we use object type instead of string, int, float,etc.
		for(Object itr:arr)
		{
			System.out.println(itr);
		}
	}

}
