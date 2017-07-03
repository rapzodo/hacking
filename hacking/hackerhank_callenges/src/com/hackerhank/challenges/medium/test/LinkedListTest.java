package com.hackerhank.challenges.medium.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class LinkedListTest {

	@Test
//	@Ignore
	public void testBasicInput() {
		int[]A = {1,4,-1,3,2};
		assertEquals(4, solution(A));
	}
	
	@Test
	public void testWithValueOfIndexGreaterThanArraySize() {
		int[]A = {1,4,-1,3,6};
		assertEquals(3, solution(A));
	}
	
	static int solution(int[] A){
		List<Integer> linkedList = new LinkedList<>();
		int index = 0;
		linkedList.add(A[index]);
		while(A[index] != - 1){
			index = A[index];
			if(index >= A.length || index < 0){
				return linkedList.size();
			}
			linkedList.add(A[index]);
		}
		return linkedList.size();
	}
	
	@Test
	public void testFindPairs() {
		int[]A = {3,5,6,3,3,5};
		assertEquals(4, findPairs(A));
	}
	static int findPairs(int[]A){
		int pairsCounter = 0;
		Arrays.sort(A);
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				if(i == j || i > j){
					continue;
				}
				if(A[i] == A[j]){
					pairsCounter++;
				}else{
					break;
				}
			}
		}
		
		return pairsCounter;
	}
	
	static class PairValue{
		private Integer v1;
		private Integer v2;
		
		public PairValue(Integer v1, Integer v2){
			this.v1=v1;
			this.v2=v2;
		}

		public Integer getV1() {
			return v1;
		}

		public void setV1(Integer v1) {
			this.v1 = v1;
		}

		public Integer getV2() {
			return v2;
		}

		public void setV2(Integer v2) {
			this.v2 = v2;
		}
		
	}
}
