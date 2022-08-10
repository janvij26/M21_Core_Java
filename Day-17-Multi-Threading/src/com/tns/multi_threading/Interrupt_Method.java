package com.tns.multi_threading;

class Thread1 extends Thread
{
	public void run()
	{
		System.out.println("Thread interruption");
	}
}
public class Interrupt_Method {

	public static void main(String[] args) {
		Thread1 t1=new Thread1();
		t1.start();   
        System.out.println("is thread interrupted "+t1.isInterrupted()); 
        t1.interrupt();   
        System.out.println("is thread interrupted " +t1.isInterrupted());   			

	}

}