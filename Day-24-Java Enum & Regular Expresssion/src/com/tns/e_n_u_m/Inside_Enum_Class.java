package com.tns.e_n_u_m;
// Java Enum Program
//Defining the enum class inside the main class
public class Inside_Enum_Class 
{
	enum Margin
	{
		Top, Bottom, Left, Right;
	}
	
	//main method
	public static void main(String[] args) {
		int count=11;
		// values():- returns all the values of enum.
		for(Margin m: Margin.values())
		{
			//
			System.out.printf("Margin Name: %d = %s\n", count++, m);
		}

	}

}
