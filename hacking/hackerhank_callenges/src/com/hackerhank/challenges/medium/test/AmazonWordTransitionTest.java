package com.hackerhank.challenges.medium.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.hackerhank.challenges.medium.WordValidTransition;

public class AmazonWordTransitionTest {

	@Test
	public void test() {
		assertTrue(WordValidTransition.check("mall","bell"));
	}

}
