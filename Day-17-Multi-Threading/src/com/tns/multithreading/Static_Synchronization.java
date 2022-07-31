package com.tns.multithreading;
// A Program for Static Synchronization

class Test1
{
	public static synchronized void display()
	{
		System.out.println("Current Thread "+ Thread.currentThread().getName());
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName()+ "i - " +i);
			
			try
			{
				Thread.sleep(50);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}

class Valueof implements Runnable
{
	Thread t;
	Test1 val;
	Valueof(Test1 val)
	{
		this.val=val;
		t=new Thread(this);
		t.start();
	}
	@SuppressWarnings("static-access")
	public void run()
	{
		val.display();
	}
}

public class Static_Synchronization {

	public static void main(String[] args) 
	{
		Test1 obj1= new Test1();
		Test1 obj2= new Test1();
		@SuppressWarnings("unused")
		Valueof t1= new Valueof(obj1);
		@SuppressWarnings("unused")
		Valueof t2= new Valueof(obj2);
	}

}
