package com.sabbproject.examples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assersions
{

	@Test
	public void testpass()
	{
	Assert.assertTrue(true);
	}
	@Test
	public void testofail()
	{
	Assert.assertFalse(false);	
	}}
//	public class Assetions 
//	{
//	@Test
//	public void title ()
//	{
//	Assert.assertEquals(0, 0);
//	}
//	}
//	@Test(description="Pass, if expected and actul values are not equal")
//	public void tryAssertNotEquals() {
//	     String expected = "xyz";
//	     String actual = "abc"; // Expected and actual values are different
//	     Assert.assertNotEquals(actual, expected);
//	 }
//	}


