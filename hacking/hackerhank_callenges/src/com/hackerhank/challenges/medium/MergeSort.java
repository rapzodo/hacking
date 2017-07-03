package com.hackerhank.challenges.medium;

public class MergeSort {
	
	public static long sort(int[] a) {
		return mergeSort(a, new int[a.length], 0, a.length-1);
	}
	private static long mergeSort(int[]a, int[] temp, int start, int end){
		int swaps = 0;
		if(start == end){
			return swaps;
		}
		int mid = (start+end) / 2;
		swaps += mergeSort(a, temp, start, mid);
		swaps += mergeSort(a, temp, mid + 1, end);
		swaps += mergeHalves(a, temp, start, mid, mid+1, end);
		copy(a, temp, start, end);
		return swaps;
	}
	private static void copy(int[] a, int[] temp, int start, int end) {
		for(int i= start; i<= end ; i++){
			a[i] = temp[i];
		}
	}
	private static long mergeHalves(int[] a, int[] temp, int leftStart, int leftEnd,int rigthStart, int rightEnd) {
		int indexLeft = leftStart;
		int indexRight = rigthStart;
		int iteratorIndex = leftStart;
		long swaps = 0;
		while(indexLeft <= leftEnd &&  indexRight <= rightEnd){
			int leftValue = a[indexLeft];
			int rightValue = a[indexRight];
			if(leftValue > rightValue){
				temp[iteratorIndex++] = a[indexRight++];
				swaps+= rigthStart - iteratorIndex +1;
			}else{
				temp[iteratorIndex++] = a[indexLeft++];
			}
		}
		while(indexLeft <= leftEnd){
			temp[iteratorIndex++] = a[indexLeft++];
		}
		while(indexRight <= rightEnd){
			temp[iteratorIndex++] = a[indexRight++];
		}
		return swaps;
	}
}
