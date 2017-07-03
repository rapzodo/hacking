package com.hackerhank.challenges.medium;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PairsCounter {

	public int countPairs(int[] A, int k) {
		Set<Pair> pairs = new HashSet<>();
		int n = A.length;
		if (n <= 2 || n >= (1000000 * 2)) {
			return -1;
		}
		Map<Integer, Integer> diffMap = new HashMap<>();
		for (int i = 0; i < A.length; i++) {
			diffMap.put(A[i], A[i] + k);
		}
		Arrays.sort(A);
		for (Map.Entry<Integer, Integer> entry : diffMap.entrySet()) {
			int index = Arrays.binarySearch(A, entry.getValue());
			if (index > -1) {
				pairs.add(new Pair(entry.getKey(), entry.getValue()));
			}
		}
		return pairs.size();
	}

	class Pair {
		int value1;
		int value2;

		public Pair(int v, int v2) {
			this.value1 = v;
			this.value2 = v2;
		}

		@Override
		public boolean equals(Object obj) {
			if (obj instanceof Pair) {
				Pair p2 = (Pair) obj;
				if (this.value1 != p2.value1 && this.value2 != p2.value2
						|| this.value1 != p2.value2 && this.value1 != p2.value1) {
					return true;
				}
			}
			return false;
		}

		@Override
		public int hashCode() {
			return value1 + value2;
		}

		@Override
		public String toString() {
			return "a=" + value1 + ",b=" + value2;
		}
	}

}
