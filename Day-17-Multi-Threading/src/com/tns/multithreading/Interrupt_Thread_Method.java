package com.tns.multithreading;

class Threads extends Thread
{
	public void run()
	{
		try
		{
			Thread.sleep(10000);
			System.out.println("Work");
		}
		catch(InterruptedException e)
		{
			throw new RuntimeException("Thread Interrupted"+e);
		}
	}
}

public class Interrupt_Thread_Method 
{
	public static void main(String args[])
	{
		Threads t1=new Threads();
		t1.start();
		try
		{
			t1.interrupt();
		}
		catch(Exception e)
		{
			System.out.println("Exception Handled"+e);
		}
	}
}
