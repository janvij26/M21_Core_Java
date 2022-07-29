package com.tns.junit5testing;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Second_Unit_Testing_Program 
{
	@Test
	@BeforeAll
	static void display()
	{	
		System.out.println("@BeforeAll: Executes once before all the Test Methods in this Class");
	}
	
	@Test
	void print()
	{
		System.out.println("Hello");
	}
	
	@Test
	@BeforeEach
	void accept()
	{	
		System.out.println("@BeforeEach: Executes before each of the Test Methods in this Class");
	}
	
	@Test
	void print1()
	{
		System.out.println("Hello Students");
	}
	
	
}
