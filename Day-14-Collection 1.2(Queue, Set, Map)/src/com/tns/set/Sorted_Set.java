package com.tns.set;

import java.util.SortedSet;
import java.util.TreeSet;

public class Sorted_Set {

	public static void main(String[] args) {
		// It will sort the string in ascending order
		SortedSet<String> s=new TreeSet<String>();
		s.add("Janvi");
		s.add("Janvis");
		s.add("Janvirs");
		System.out.println(s);
	}

}
