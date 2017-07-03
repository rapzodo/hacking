package com.wallethub.challenge.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class TopPhrases {

	private static final String PHRASE_DELIMITER_REGEX = " \\s*\\|\\s*";
	public static final int MAXRESULTS = 5;//for testing purposes, in production should return the top 100000
	
//	Algorithm Complexity O(nlogN)
	public static Map<String, Integer> getTopPhrases(File file) throws IOException {
		Map<String, Integer> topPhrasesMap = new HashMap<>();
		Comparator<String> intValueComparator = new TopPhrases.IntValueComparator(topPhrasesMap);
		TreeMap<String, Integer> sortedResult = new TreeMap<>(intValueComparator);
		getPhrasesFromFile(file, topPhrasesMap);
		sortedResult.putAll(topPhrasesMap);
		return getHundredThousandTopPhrases(intValueComparator, sortedResult);
	}

private static Map<String, Integer> getHundredThousandTopPhrases(Comparator<String> intValueComparator,
		TreeMap<String, Integer> sortedResult) {
	Map<String, Integer> topPhrasesMap;
	int counter = 0;
	topPhrasesMap = new TreeMap<>(intValueComparator);
	for(Entry<String, Integer> entry : sortedResult.entrySet()){
		if(counter < MAXRESULTS){
			topPhrasesMap.put(entry.getKey(), entry.getValue());
			counter++;
		}
	}
	return topPhrasesMap;
}

private static void getPhrasesFromFile(File file, Map<String, Integer> topPhrasesMap)
		throws FileNotFoundException, IOException {
	Scanner scanner = null;
	InputStream is = null;
	try{	
		is = new FileInputStream(file);
		scanner = new Scanner(is);
		while(scanner.hasNext()){
			findMostFrequentPhrasesInLine(scanner.nextLine(), topPhrasesMap);
		}
	}finally{
		if(is != null){
			is.close();
		}
		if(scanner != null){
			scanner.close();
		}
	}
}
	
	private static void findMostFrequentPhrasesInLine(String line,Map<String, Integer> resultMap) {
		String[] split = line.split(PHRASE_DELIMITER_REGEX);
		for (String string : split) {
			if(resultMap.containsKey(string)){
				resultMap.put(string, resultMap.get(string)+1);
			}else
				resultMap.put(string, 1);
		}
	}
	
	static class IntValueComparator implements Comparator<String>{
		
		Map<String, Integer> input;
		
		public IntValueComparator(Map<String, Integer> input) {
			this.input = input;
		}
		
		@Override
		public int compare(String o1, String o2) {
			if(input.get(o1) == input.get(o2)){
				return o1.compareTo(o2);
			}
			if(input.get(o1) <= input.get(o2)){
				return 1;
			}else
				return -1;
		}
	}
	
}
