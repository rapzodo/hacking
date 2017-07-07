package com.glispa.hard;

import java.util.Arrays;

public class DuplicatePairsCounter {

	public static int findDuplicatePairsCount(int[]A){
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
}
