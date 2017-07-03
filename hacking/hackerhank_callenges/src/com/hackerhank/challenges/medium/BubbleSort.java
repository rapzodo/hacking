package com.hackerhank.challenges.medium;

public class BubbleSort {

	public static void main(String[] args) {
		int[]a = {3,2,1};
		sort(a);
	}
	
	static int sort(int[] a){
		int n = a.length;
		int totalSwaps = 0;
		for (int i = 0; i < n; i++) {
			int numberOfSwaps = 0;
		    for (int j = 0; j < n - 1; j++) {
		        if (a[j] > a[j + 1]) {
		            swap(a,j);
		            numberOfSwaps++;
		            totalSwaps++;
		        }
		    }
		    if (numberOfSwaps == 0) {
		        break;
		    }
		}
		return totalSwaps;
	}
	static void swap(int[] a, int position){
		int temp = a[position];
		a[position] = a[position+1];
		a[position+1]=temp;
	}
	
}
