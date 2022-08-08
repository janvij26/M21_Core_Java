package com.tns.final_keyword;

//final method is inherited but not override
class X
{
	final void run()
	{
		System.out.println("Hello");
	}
}

public class Final_Method_Inherited extends X{

	public static void main(String[] args) {
		
		Final_Method_Inherited f=new Final_Method_Inherited();
		f.run();
	}

}
