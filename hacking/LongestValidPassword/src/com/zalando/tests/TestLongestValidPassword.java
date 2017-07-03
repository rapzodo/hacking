package com.zalando.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.zalando.solution.LongestValidPasswordValidator;

public class TestLongestValidPassword {
	private String defaultInput = "a0Ba";
	private String VALID_PASSWORD_REGEX = "[A-Z]";
	LongestValidPasswordValidator validator = new LongestValidPasswordValidator();
	@Test
	public void shouldReturnTwo() {
		assertEquals(2, validator.solution(defaultInput));
	}
	
	@Test
	public void shouldReturnNegativeOne(){
		assertEquals(-1,validator.solution("012"));
	}
	
	@Test
	public void shouldReturnOne(){
		assertEquals(1,validator.solution("B0A1"));
	}
	@Test
	public void shouldReturnFive(){
		assertEquals(5,validator.solution("BBAAB"));
	}
	

}
