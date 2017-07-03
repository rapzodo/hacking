package com.hackerhank.challenges.hard.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class ContactsTest {

	@Test
	public void shouldReturnTrue() {
		String partial = "hac";
		String input = "hackerranck";
		assertTrue(input.startsWith(partial));
	}
	@Test
	public void shouldReturnFalse() {
		String partial = "hak";
		String input = "hack";
		assertFalse(input.startsWith(partial));
	}

}
