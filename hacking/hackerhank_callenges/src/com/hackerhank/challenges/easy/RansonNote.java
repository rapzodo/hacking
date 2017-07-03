package com.hackerhank.challenges.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Stream;

public class RansonNote {

	public static String analyze(String[] magazineLine, String[] rNoteLine) {
		Map<String, Integer> magWords = new HashMap<>();
		Map<String, Integer> ransonWords = new ConcurrentHashMap<>();
		readAndPopulateWords(magazineLine, magWords);
		readAndPopulateWords(rNoteLine, ransonWords);
		checkIfCanCreateUntracebleNote(magWords, ransonWords);
		return ransonWords.isEmpty() ? "Yes":"No";
	}

	private static void checkIfCanCreateUntracebleNote(Map<String, Integer> magWords, Map<String, Integer> ransonWords) {
		ransonWords.forEach((k,v) -> {
			if(magWords.get(k) >= v){
				ransonWords.remove(k);
			}
		});
	}

	private static void readAndPopulateWords(String[] input, Map<String, Integer> magWords) {
		Stream.of(input).forEach(s-> {
			s = s.toLowerCase();
			if(magWords.get(s) == null){
				magWords.put(s, 1);
			}else{
				magWords.put(s, magWords.get(s)+1);
			}
		});
	}

}
