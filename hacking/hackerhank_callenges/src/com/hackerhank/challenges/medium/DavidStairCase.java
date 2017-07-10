package com.hackerhank.challenges.medium;

public class DavidStairCase {

	public static Integer countWays(int steps) {
		if(steps < 0){ return 0;}
		if(steps == 0) { return 1;}
		Integer result1 = countWays(steps-1);
		Integer result2 = countWays(steps -2);
		Integer result3 = countWays(steps -3);
		return result1 + result2 + result3;
	}
}
