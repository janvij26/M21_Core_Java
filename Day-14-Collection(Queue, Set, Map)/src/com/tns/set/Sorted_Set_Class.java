package com.tns.set;

import java.util.SortedSet;
import java.util.TreeSet;

public class Sorted_Set_Class {

	public static void main(String[] args) {
		//it will sort the string in ascending order
		SortedSet<String> s=new TreeSet<String>();
		s.add("Abstract");//1
		s.add("Parag");//4
		s.add("Allows");//2
		s.add("Azad");//3
		System.out.println(s);

	}

}