package com.hackerhank.challenges.easy;

import java.util.HashSet;
import java.util.Set;

public class LonelyInteger {
	
	public static Integer lonelyInteger(int[] a) {
		if(a.length == 1){
			return a[0];
		}
		Set<Integer> pairs = new HashSet<>();
		for (int i = 0; i < a.length; i++) {
			if(!pairs.add(a[i])){
				pairs.remove(a[i]);
				continue;
			}
		}
		return pairs.iterator().next();
	}

}
