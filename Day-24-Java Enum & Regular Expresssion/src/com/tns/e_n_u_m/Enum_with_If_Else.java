package com.tns.e_n_u_m;

public class Enum_with_If_Else 
{
	enum Emp_Type
	{
		Contract, Permanent, Temporary;
	}
	
	static void print(Emp_Type e)
	{
		if(e==Emp_Type.Permanent)
		{
			System.out.println("Permanent Employee......!");
		}
		else if(e==Emp_Type.Contract)
		{
			System.out.println("Contract-Based Employee......!");
		}
		else
		{
			System.out.println("Temporary Employee......!");
		}
	}

	public static void main(String[] args) 
	{
		Emp_Type e=Emp_Type.Temporary;
		print(e);

	}

}
