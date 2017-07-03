package com.wallethub.challenge.service;

import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

public class ComplementaryPairs {

//	Algorithm complexity O(nlogn)
//	SHOULD IMPLEMENT AS AMAZON COUNTING PAIRS
	public static List<Entry<Integer,Integer>> findKComplimentary(int[] input, int K) {
		List<Entry<Integer, Integer>> pairs = new ArrayList<>();
		int begin = 0;
		int end = input.length-1;
		int length = input.length-1;
		while(begin < length){
			if(end == begin){
				begin++;
				end = length;
				continue;
			}
			int value1 = input[begin];
			int value2 = input[end];
			if(isKComplementary(value1, value2,K)){
				pairs.add(new SimpleImmutableEntry<Integer, Integer>(value1,value2));
				begin++;
				end = length;
			}else{
				end-=1;
				continue;
			}
		}
		return pairs;
	}

	private static boolean isKComplementary(int begin, int end, int K) {
	return (begin + end) == K;
	}

}
