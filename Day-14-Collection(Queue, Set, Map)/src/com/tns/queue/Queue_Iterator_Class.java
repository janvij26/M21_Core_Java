package com.tns.queue;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

public class Queue_Iterator_Class  {

	public static void main(String[] args) {
		Queue<Integer>q=new ArrayDeque<Integer>();
		for(int i=11;i<15;i++)
		{
			q.add(i);
		}
		System.out.println(q);
		boolean isadded=q.offer(25);
		System.out.println("IsAdded: "+isadded);
		System.out.println(q);
		//Iterator =to return single-single elements separately 
		Iterator<Integer>itr=q.iterator();
		System.out.println("The elements are: ");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	

	}

}

