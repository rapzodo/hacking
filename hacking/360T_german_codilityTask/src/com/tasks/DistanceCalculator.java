package com.tasks;

public class DistanceCalculator {

	
	public int solution(int[]A){
		int shortestDistance=-1;
		for (int i = 0; i < A.length; i++) {
			if(shortestDistance == 0){
				return 0;
			}
			shortestDistance = distance(A,i,i+1,A.length,shortestDistance);
		}
		return shortestDistance;
	}

	private int distance(int[]A,int p, int Q,int N, int minDistance){
		if(Q >= N){
			return minDistance;
		}
		int distance = calculateDistance(A[p], A[Q]);
		if(minDistance == -1 || distance < minDistance){
			minDistance = distance;
		}
		return distance(A,p,Q+1,N,minDistance);
		
	}
	
	private int calculateDistance(int i, int j) {
		int distance = i - j;
		if(distance >= 0){
			return distance;
		}
		return j-i;
	}
}
