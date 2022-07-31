package com.tns.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Linked_List {

	public static void main(String[] args) {
		@SuppressWarnings({ "rawtypes", "unchecked" })
		List<Object> obj=new LinkedList();
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
