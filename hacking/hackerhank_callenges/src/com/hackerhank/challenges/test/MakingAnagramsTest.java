package com.hackerhank.challenges.easy.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class MakingAnagramsTest {

	@Test
	public void shouldReturnFour() {
		assertEquals(4, solution("cde", "abc"));
	}
	@Test
	public void shouldReturnTwo() {
		assertEquals(2, solution("bacdc", "dcbad"));
	}
	
	public int solution(String a, String b){
		StringBuilder sbA = new StringBuilder(a);
		StringBuilder sbB = new StringBuilder(b);
		for (int i = 0; i < sbA.length(); i++) {
			int indexOf = sbB.indexOf(String.valueOf(sbA.charAt(i)));
			if(indexOf >=0){
				sbB.deleteCharAt(indexOf);
				sbA.deleteCharAt(i);
			}
		}
		return sbA.append(sbB).length();
	}
}
