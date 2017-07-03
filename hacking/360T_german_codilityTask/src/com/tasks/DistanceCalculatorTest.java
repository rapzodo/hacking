package com.tasks;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class DistanceCalculatorTest {

	@Test
	@Ignore
	public void shouldReturn2() {
		int[] A = {8,24,3,20,1,17};
		DistanceCalculator calc = new DistanceCalculator();
		assertEquals(2, calc.solution(A));
	}
	@Test
	@Ignore
	public void shouldReturn0() {
		int[] A = {7,21,3,42,3,7};
		DistanceCalculator calc = new DistanceCalculator();
		assertEquals(0, calc.solution(A));
	}
	
	@Test
	@Ignore
	public void shouldReturn3(){
		int[]A = {1,4,3,3,1,3,1};
		int result = new MostOftem().solution(3, A);
		assertTrue(result == 1 || result == 3) ;
	}
	@Test
	@Ignore
	public void shouldReturn6(){
		int[]A = {1,3,-3};
		assertEquals(6, new MaxSumDistance().solution(A));
	}
	@Test
	public void shouldReturn10(){
		int[]A = {1,2,3,4};
		int sum  = 0 ;
		for (int i = 0; i < A.length; i++) {
			sum+=A[i];
		}
		assertEquals(10, sum);
	}

}
