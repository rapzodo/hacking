package com.tasks;

public class MaxSumDistance {
	
	
	public int solution(int[] A){
		int N = A.length;
		int maxDist = A[0] + A[0];
		for (int i = 0; i < N; i++) {
			for(int j = 1 ; j < N ; j++){
				int distance = calculate(A, i, j);
				if(maxDist < distance){
					maxDist = distance;
				}
			}
		}
		return maxDist;
	}
	
	public int calculate(int[]A,int P, int Q){
		int result = A[P]+A[Q] + (Q - P);
		return result;
	}
	
}

