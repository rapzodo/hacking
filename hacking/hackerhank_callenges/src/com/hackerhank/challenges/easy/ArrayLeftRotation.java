package com.hackerhank.challenges.easy;

import java.util.Arrays;
import java.util.StringJoiner;

public class ArrayLeftRotation {

	// A left rotation operation on an array of size shifts each of the array's
	// elements unit to the left. For example, if left rotations are performed
	// on array , then the array would become .
	//
	// Given an array of integers and a number, , perform left rotations on the
	// array. Then print the updated array as a single line of space-separated
	// integers.
	//
	// Input Format
	//
	// The first line contains two space-separated integers denoting the
	// respective values of (the number of integers) and (the number of left
	// rotations you must perform).
	// The second line contains space-separated integers describing the
	// respective elements of the array's initial state.
	//
	// Constraints
	//
	// Output Format
	//
	// Print a single line of space-separated integers denoting the final state
	// of the array after performing left rotations.
	//
	// Sample Input
	//
	// 5 4
	// 1 2 3 4 5
	// Sample Output
	//
	// 5 1 2 3 4
	// Explanation
	//
	// When we perform left rotations, the array undergoes the following
	// sequence of changes:
	//
	// Thus, we print the array's final state as a single line of
	// space-separated values, which is 5 1 2 3 4.
	//
	public String solutionNlogN(int[] A, int rotations) {
		int length = A.length;
		int[] aux = new int[length];
		if (rotations == length) {
			return arrayToString(A);
		}
		for (int i = 0; i < rotations; i++) {
			int temp = A[0];
			for (int j = 0; j < aux.length; j++) {
				if(j == (length -1)){
					A[j] = temp;
					break;
				}
				A[j] = A[j+1];
			}
		}
		
		return arrayToString(A);
	}
	public String solutionN(int[] A, int rotations) {
		int length = A.length;
		int[] aux = new int[rotations];
		int[] remain = new int[length-rotations];
		if(rotations == length){
			return arrayToString(A);
		}
		aux = Arrays.copyOf(A, rotations);
		remain = Arrays.copyOfRange(A, rotations,length);
		return arrayToString(remain) +" "+arrayToString(aux);
	}


	public String arrayToString(int[] A) {
		StringJoiner sj = new StringJoiner(" ");
		Arrays.stream(A).forEach(i -> sj.add(String.valueOf(i)));
		return sj.toString();
	}
	
	
}
