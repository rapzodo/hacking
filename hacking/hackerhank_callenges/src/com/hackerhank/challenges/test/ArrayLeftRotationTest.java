package com.hackerhank.challenges.easy.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.hackerhank.challenges.easy.ArrayLeftRotation;

public class ArrayLeftRotationTest {

	private ArrayLeftRotation app = new ArrayLeftRotation();
	private int[]A = {1,2,3,4,5};
	
	@Test
	public void shouldPrintOriginalArrayIfRotationsEqualArraySize() {
		int[]A = {1,2};
		assertEquals("1 2", app.solutionNlogN(A, 2));
	}
	
	@Test
	public void testOneRotation(){
		int[]A = {1,2,3,4,5};
		assertEquals("2 3 4 5 1", app.solutionNlogN(A, 1));
	}
	
	@Test
	public void testTwoRotations(){
		int[]A = {1,2,3,4,5};
		assertEquals("3 4 5 1 2", app.solutionNlogN(A, 2));
	}
	@Test
	public void testFourRotations(){
		int[]A = {1,2,3,4,5};
		assertEquals("5 1 2 3 4", app.solutionNlogN(A, 4));
	}

	@Test
	public void testSecondSolution(){
		assertEquals("2 3 4 5 1", app.solutionN(A,1));
	}
}
