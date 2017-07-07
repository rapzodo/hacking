package com.zooplus.munich.tasks;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class ShortestTravel {
	int[]A = new int[]{7,3,7,3,1,3,4,1};
//	0,1,4,6
	@Test
	public void test() {
		assertEquals(5, solution(A));
	}
	@Test
	public void testSolution2() {
		int[]A = new int[]{7,3,1,4,7,3,4,1};
		assertEquals(4, solution2(A));
	}
	
	@Test
//	@Ignore
	public void testWithFour() {
		int[]A = new int[]{7,3,7,3,1,3,4,7};
		assertEquals(4, solution2(A));
	}
	
	public int solution(int[]A){
		Set<Integer> destinations = new HashSet<>();
		int minDays = 0;
		int dayStarting = 0;
		int daysLeft = A.length;
		for (int i = 0; i < A.length; i++) {
			destinations.add(A[i]);
		}
		while(daysLeft >= destinations.size()) {
			Set<Integer> visited = new HashSet<>();
			int days = 0;
			for (int j = dayStarting; j < A.length; j++) {
				visited.add(A[j]);
				days ++;
				if(visited.equals(destinations)){
					break;
				}
			}
			if(visited.size() < destinations.size()){
				break;
			}
			if(minDays == 0){
				minDays = days;
			}
			if(minDays > days){
				minDays = days;
			}
			dayStarting++;
			daysLeft = A.length - dayStarting;
		}
		return minDays;
	}
	
	public int solution2(int[]A){
		Set<Integer> destinations = new HashSet<>();
		int minDays = 0;
		int lastDestination = 0;
		for (int i = 0; i < A.length; i++) {
			destinations.add(A[i]);
		}
		Set<Integer> visited = new HashSet<>();
		for (int i = 0; i < A.length; i++) {
			if(!visited.add(A[i])){
				lastDestination = i;
				break;
			}
		}
		visited.clear();
		for (int i = lastDestination; i < A.length; i++) {
			visited.add(A[i]);
			minDays++;
			if(visited.equals(destinations)){
				break;
			}
		}
		return minDays;
	}
}
