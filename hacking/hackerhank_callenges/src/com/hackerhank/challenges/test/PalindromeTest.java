package com.hackerhank.challenges.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.interview.challenges.medium.Palindrome;

public class PalindromeTest {

	@Test
	public void shouldReturnYesForEven(){
		assertEquals("Yes",Palindrome.isPalindrome("aabbbbaa"));
	}
	@Test
	public void shouldReturnYesOdd(){
		assertEquals("Yes",Palindrome.isPalindrome("madam"));
	}

}
