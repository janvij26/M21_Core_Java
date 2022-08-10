package com.tns.multi_threading;

public class Start_Run_Method extends Thread
{
	public void run()
	{
		System.out.println("Thread is going to run");
	}

	public static void main(String[] args) 
	{
		Start_Run_Method e=new Start_Run_Method();
		e.start();

	}

}
