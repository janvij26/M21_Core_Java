package com.tns.testing;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Third_Unit_Testing_Program 
{
	
	@DisplayName("Test is Successfully implemented")
	@Test
	void function()
	{
		
		System.out.println("Want to display a name");
	}
	@Test
	@Disabled("Not implemented")
	void function1()
	{
		System.out.println("Fails");
	}

}