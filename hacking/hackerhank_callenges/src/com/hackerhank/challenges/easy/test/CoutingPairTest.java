package com.hackerhank.challenges.easy.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.hackerhank.challenges.medium.PairsCounter;

public class CoutingPairTest {
	
	private PairsCounter app = new PairsCounter();

	@Test
	public void shouldReturn2() {
		int[]A = {6,1,1,2,2,3,3};
		assertEquals(2, app.countPairs(A,1));
	}
	@Test
	public void shouldReturnFour() {
		int[]A = {6,1,2,3,4,5,6};
		assertEquals(4, app.countPairs(A,2));
	}
}
