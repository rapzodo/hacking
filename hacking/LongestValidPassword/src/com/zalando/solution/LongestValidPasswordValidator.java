package com.zalando.solution;

public class LongestValidPasswordValidator {
	private String DIGIT_REGEX = "\\d";
	private String VALID_PWD_REGEX ="^(.*[A-Z]).*";
	public int solution(String input){
		
		String[] words = input.split(DIGIT_REGEX);
		int longest = -1;
		for (String string : words) {
			if(string.matches(VALID_PWD_REGEX)){
				if(string.length() > longest){
					longest = string.length();
				}
			}
		}
		return longest;
	}
	
}
