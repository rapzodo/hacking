package com.hackerhank.challenges.easy.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.hackerhank.challenges.easy.LonelyInteger;

public class LonelyIntegerTest {

	@Test
	public void shouldReturnFive() {
		int[] A = {1,1,4,4,5,6,7,6,8,7,8};
		assertEquals(Integer.valueOf(5), LonelyInteger.lonelyInteger(A));
	}
	@Test
	public void shouldReturnFirstElement() {
		int[] A = {1};
		assertEquals(Integer.valueOf(1), LonelyInteger.lonelyInteger(A));
	}

}
