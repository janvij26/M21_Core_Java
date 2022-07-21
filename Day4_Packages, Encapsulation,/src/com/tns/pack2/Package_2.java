package com.tns.pack2;

// Way to access any method of any class packages
//1.import com.tns.pack1.Package_1;
import com.tns.pack1.*;

public class Package_2 
{
	public static void main(String args[])
	{
		Package_1 p=new Package_1();
		p.print();
	}
}
