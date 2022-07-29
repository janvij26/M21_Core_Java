package com.tns.junit5testing;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class Third_Unit_Testing_Program 
{
	@Test
	@DisplayName("Test is Successfully implemented")
	void function()
	{
		System.out.println("Want to Display a Name");
	}
	
	@Test
	@Disabled("Not Implemented")
	void function1()
	{
		System.out.println("Disabled this Method");
	}
	
}
