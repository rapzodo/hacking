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

import com.glispa.hard.DuplicatePairsCounter;

public class GlispaTasksTest {

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
		assertEquals(4, DuplicatePairsCounter.findDuplicatePairsCount(A));
	}
	
	
}
