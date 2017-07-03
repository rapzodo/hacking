package com.wallethub.challenge.service;


public class Palindrome {

	
//	Algorithm complexity O(logn)
	public static boolean isPalindrome(String source){
		int n = source.length() - 1;
		if(n <= 1){
			return false;
		}
		int i = 0, j =n;
		while (i < j){
			if(source.charAt(j)!=source.charAt(i)){
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}
