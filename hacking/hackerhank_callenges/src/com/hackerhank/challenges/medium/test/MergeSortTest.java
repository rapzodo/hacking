package com.hackerhank.challenges.medium.test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.Ignore;
import org.junit.Test;

import com.hackerhank.challenges.medium.MergeSort;

public class MergeSortTest {

	
	@Test
	public void shouldReturnYesForEven(){
		assertEquals("Yes",isPalindrome("aabbbbaa"));
	}
	@Test
	public void shouldReturnYesOdd(){
		assertEquals("Yes",isPalindrome("madam"));
	}
	 static String isPalindrome(String A){
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
	
	@Test
//	@Ignore
	public void shouldSortTheArray() {
		int[]a = {2 ,1 ,3 ,1 ,2};
		int[]expected = Arrays.copyOf(a, a.length);
		Arrays.sort(expected);
		MergeSort.sort(a);
		assertArrayEquals(expected, a);
	}
	@Test
//	@Ignore
	public void shouldReturn0Turns() {
		int[]a = {1,2,3};
		assertEquals(0, MergeSort.sort(a));
	}
	@Test
	public void shouldReturn4Turns() {
		int[]a = {2 ,1 ,3 ,1 ,2};
		assertEquals(4, MergeSort.sort(a));
	}

}
