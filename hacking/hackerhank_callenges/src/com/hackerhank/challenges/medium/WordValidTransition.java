package com.hackerhank.challenges.medium;

import java.util.Arrays;
import java.util.List;

public class WordValidTransition {

	static char[] alphabet = "abcdefghijlmnopqrstuz".toCharArray();
	static List<String> dictionary = Arrays.asList("abel","mall","ball","wall","well","hell","hill","bell");
	
	public static boolean check(String string, String string2) {
		int x =0;
		int y =0;
		boolean isValid = false;
		for (int i = 0; i < alphabet.length; i++) {
			String variation = string.replace(string.charAt(x), alphabet[i]);
		}
		return false;
	}

}
