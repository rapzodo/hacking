package com.tasks;

public class MostOftem {

	public int solution(int M, int[] A) {
	        int N = A.length;
	        int[] count = new int[M + 1];
	        for (int i = 0; i <= M; i++)
	            count[i] = 0;
	        int maxOccurence = 1;
	        int index = -1;
	        for (int i = 0; i < N; i++) {
				if (A[i] < M && count[A[i]] > 0) {
	                int tmp = count[A[i]];
	                if (tmp > maxOccurence) {
	                    maxOccurence = tmp;
	                    index = i;
	                }
	                count[A[i]] = tmp + 1;
	            } else if(A[i] < M){
	                count[A[i]] = 1;
	            }
	        }
	        return A[index];
	    }
	
}
