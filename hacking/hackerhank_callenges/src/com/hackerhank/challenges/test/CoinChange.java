package com.hackerhank.challenges.test;

import java.util.HashMap;
import java.util.Map;

public class CoinChange {
	public static Long solution(int dolar, int[] coins){
		return solution(dolar, coins,0, new HashMap<>());
	}
	
	public static Long solution(int dolar, int[] coins, int indexCoin, Map<String, Long> memo){
		if(dolar == 0){
			return 1L;
		}
		if(coins.length <= indexCoin){
			return 0L;
		}
		Long ways = 0L;
		int amountInCoins = 0;
		int changeLeft = 0;
		String key = dolar +"-"+indexCoin;
		if(memo.containsKey(key)){
			return memo.get(key);
		}
		while(amountInCoins <= dolar){
			changeLeft = dolar - amountInCoins;
			ways +=solution(changeLeft, coins, indexCoin+1, memo);
			amountInCoins+=coins[indexCoin];
		}
		memo.put(key, ways);
		return ways;
	}

}
