package com.mohshub.jp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class JUnitPractice {

	@Test
	public void addTestForFail() {
		Assert.assertEquals(6, add());
	}
	
	@Test
	public void addTestForPass() {
		Assert.assertEquals(4, add());
	}
	
	private int add() {
		return (1+3);
	}
	private int mul() {
		return (1*4);
	}
	private int rem() {
		return (3/2);
	}
	private int sub() {
		return (3-1);
	}
	
	@Test
	public void getValueTest() {
		String expected = "abcdef";
		String actual = getValue("DEF");
		
		Assert.assertEquals(expected.toUpperCase(), actual);
	}
	
	private String getValue(String value) {
		return ("ABC"+value);
	}
	
	@Test
	public void testCoinToss() {
		assertTrue(getToss());
	}
	
	private boolean getToss() {
		double coin = Math.random()* 10;
		return ((int)coin%2==0);
	}
	
	
	@Test(expected = ArithmeticException.class)
	public void exceptionCheckTest() {
		double a = 5/0;
	}
	
	@Test
	public void getValTest() {
		Demo demo = new Demo();
		
		Assert.assertEquals("hello", demo.getVal());
	}
	
}
