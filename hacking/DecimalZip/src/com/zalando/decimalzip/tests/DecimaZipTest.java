package com.zalando.decimalzip.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.zalando.decimalzip.solutions.DecimalZipCalculator;

public class DecimaZipTest {

	private int defaultintA = 12;
	private int defaultintB = 56;
	private DecimalZipCalculator calc= new DecimalZipCalculator();
	@Test
	public void testExcedsInput() {
		assertEquals(-1, calc.getDecimalZip(101000000, defaultintB));
	}
	
	@Test
	public void shouldReturnOneFiveTwoSix(){
		assertEquals(1526, calc.getDecimalZip(defaultintA, defaultintB));
	}
	@Test
	public void testWithSecondIntBiggerThanFirst(){
		assertEquals(16273890, calc.getDecimalZip(123, 67890));
	}
	@Test
	public void testWithFirstIntBiggerThanSecond(){
		assertEquals(16273845, calc.getDecimalZip(12345,678));
	}
	@Test
	public void testWithZero(){
		assertEquals(10234, calc.getDecimalZip(1234,0));
	}
	@Test
	public void testStartingWithZero(){
		assertEquals(123, calc.getDecimalZip(0,123));
	}
	@Test
	public void testWithTwoZeroes(){
		assertEquals(9182003, calc.getDecimalZip(98,12003));
	}
	@Test
	public void testWithTwoZeroesFirst(){
		assertEquals(9182030, calc.getDecimalZip(9800,123));
	}
	@Test
	public void overSizedResult(){
		assertEquals(-1, calc.getDecimalZip(11,100000000));
	}

}
