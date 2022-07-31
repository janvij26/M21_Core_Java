package com.tns.queue;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

public class Queue_Iterator {

	public static void main(String[] args) 
	{
		Queue<Integer> q=new ArrayDeque<Integer>();
		for(int i=11;i<15;i++)
		{
			q.add(i);
		}
		System.out.println(q);
		boolean isadded=q.offer(25);
		System.out.println("Elements IsAdded: "+isadded);
		System.out.println(q);
		// Iterator: To return single-single elements separately
		Iterator<Integer>itr=q.iterator();
		System.out.println("The Elements are: ");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
