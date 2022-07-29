package com.tns.junit5testing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assume.assumeFalse;
import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class Fifth_Unit_Testing_Program 
{
	@Test
	@Disabled
	void trueAssumption()
	{
		// assumeTrue says that if your Assumption and result 
		// both are true then it will execute it else not
		assumeTrue(5>1);
		assertEquals(5+2,7);
	}
	
	@Test
	@Disabled
	void falseAssumption()
	{
		// Will evaluate the given assumption and test will run if result if false
		assumeFalse(5<1);
		assertEquals(5+2,7);
	}
	
	@Test
	void thatAssumption()
	{
		// It will evaluate the lambda executable only if given assumption is True
		String str="Janvi";
		assumingThat(str.equals("Jhanvi"),
					()->assertEquals(2+3,5));
	}

}
