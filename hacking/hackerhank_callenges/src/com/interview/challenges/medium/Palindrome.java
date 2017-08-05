package com.interview.challenges.medium;

public class Palindrome {

	public static String isPalindrome(String A){
	    int mid = A.length() / 2;
	    StringBuilder sb = new StringBuilder(A.substring(mid));
	    String reversedHalf = sb.reverse().toString();
	    String firstHalf = A.substring(0,mid);
	    if(A.length() % 2 != 0){
	    	firstHalf = A.substring(0, mid +1);
	    }
		if(reversedHalf.equals(firstHalf)){
	        return "Yes";
	    }else{
	       return "No";
	    }
	}

}
