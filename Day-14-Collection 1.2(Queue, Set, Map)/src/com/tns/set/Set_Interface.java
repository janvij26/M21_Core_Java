package com.tns.set;

import java.util.HashSet;
import java.util.Set;

public class Set_Interface {

	public static void main(String[] args) {
		//Set<Integer>obj=new HashSet<Integer>();
		Set<Object>obj=new HashSet<Object>();
		// 1.Set is an Unordered
		obj.add("Janvi");
		obj.add(15);
		obj.add('s');
		obj.add(65);
		System.out.println(obj);
		
		
	}

}
