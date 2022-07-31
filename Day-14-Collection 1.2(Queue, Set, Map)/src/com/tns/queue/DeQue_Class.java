package com.tns.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DeQue_Class {

	public static void main(String[] args) 
	{
		Deque<Object> d=new ArrayDeque<Object>();
		d.add(11);
		// Adding the Elements on Front and Rear End
		d.addFirst(13);
		d.addLast(7);
		d.add("Janvi");
		d.add("Sid");
		// Removing the Elements from Front and Rear End 
		System.out.println(d);

	}

}
