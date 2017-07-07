package com.challenges.spotify.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.challenges.spotify.CharChainCounter;

public class CharChainCounterTest {
	
	String expected = "a3b2c1f1";
	
	@Test
	public void testShoudReturnTrue() {
		String input = "aaabbcf";
		assertEquals(expected, CharChainCounter.transform(input));
	}
	@Test
	public void testShoudReturnFalse() {
		String input = "aaabbcff";
		assertNotEquals(expected, CharChainCounter.transform(input));
	}
	@Test
	public void testShoudReturnTrueForStringEndingWithAChain() {
		String input = "aaabbcffff";
		expected = "a3b2c1f4";
		assertEquals(expected, CharChainCounter.transform(input));
	}
	@Test
	public void testShoudReturnTrueForASingleChar() {
		String input = "a";
		expected = "a1";
		assertEquals(expected, CharChainCounter.transform(input));
	}

}
