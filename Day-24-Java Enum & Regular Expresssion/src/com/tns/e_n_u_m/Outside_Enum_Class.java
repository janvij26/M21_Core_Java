package com.tns.e_n_u_m;
// Java Enum Program 
// Defined enum class outside main class.
enum Car
{
	Brezza, Mercedes, BMW;	
}

public class Outside_Enum_Class 
{
	//creating the main method 
	public static void main(String[] args) {
		Car c = Car.Brezza;
		System.out.println(c);

	}

}
