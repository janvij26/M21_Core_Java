package com.tns.set;


import java.util.LinkedHashSet;
import java.util.Set;

public class Linked_Hash_Set {

	public static void main(String[] args) {
		Set<Object>obj=new LinkedHashSet<Object>();
		// 1.HashSet/Set is an Unordered and LinkedHashSet is an ordered
		// 2.Set does not allow Duplicated values and List Allows Duplicated Values
		obj.add("Janvi");
		obj.add(15);
		obj.add('s');
		obj.add(65);
		obj.add('s');
		obj.add(null);
		obj.add(null);
		
		System.out.println(obj);

	}

}
