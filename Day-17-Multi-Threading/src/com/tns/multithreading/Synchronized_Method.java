package com.tns.multithreading;
// A Program on Synchronized Method.

class Test
{
	// Synchronized Method
	synchronized void printTable(int n)
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(n*i);
			
			try
			{
				Thread.sleep(400);
			}
			catch(Exception e)
			{
				System.out.println(e);	
			}
		}
		
	}
}

class Thread1 extends Thread
{
	Test t;
	Thread1(Test t)
	{
		this.t=t;
	}
	
	public void run()
	{
		t.printTable(5);
	}
}

class Thread2 extends Thread
{
	Test t;
	Thread2(Test t)
	{
		this.t=t;
	}
	
	public void run()
	{
		t.printTable(100);
	}
}

public class Synchronized_Method {

	public static void main(String[] args) 
	{
		// Only One Object
		Test obj= new Test();
		Thread1 t1=new Thread1(obj);
		Thread2 t2=new Thread2(obj);
		t1.start();
		t2.start();

	}

}
