package com.sabbproject.examples;


import org.testng.annotations.Test;

public class Parallel
{

@Test
public void testCase1() {
	System.out.println("I am inside Thread 1 : test case one with Thread id :" +Thread.currentThread().getId());
	}
	
@Test
public void testCase2() {
		System.out.println("I am inside Thread 1 : test case two with Thread id :" +Thread.currentThread().getId());
	}
	
@Test
public void testCase3() {
		System.out.println("I am inside Thread 1 : test case three with Thread id :" +Thread.currentThread().getId());
	}
	
@Test
public void testCase4() {
		System.out.println("I am inside Thread 1 : test case four with Thread id :" +Thread.currentThread().getId() );
	}
	
}

