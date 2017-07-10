package com.hackerhank.challenges.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class CoinChangeTest {

	@Test
	public void test() {
		int[] coins = {1,2,3};
		assertEquals(Long.valueOf(4), CoinChange.solution(4,coins));
	}

}
