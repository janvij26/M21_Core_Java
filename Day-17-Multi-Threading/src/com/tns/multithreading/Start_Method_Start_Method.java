package com.tns.multithreading;

public class Start_Method_Start_Method extends Thread
{
	public void run()
	{
		System.out.println("Thread is going to Run");
	}

	public static void main(String[] args) {
		Start_Method_Start_Method s=new Start_Method_Start_Method();
		s.start();
		s.start();
		
		

	}

}
