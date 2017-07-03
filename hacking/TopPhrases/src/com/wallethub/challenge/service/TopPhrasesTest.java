package com.wallethub.challenge.service;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Test;

public class TopPhrasesTest {

	@Test
	public void testTopFive() throws IOException {
		Map<String, Integer> expected = new LinkedHashMap<>();
		expected.put("Foobar Candy", 10);
		expected.put("PGA", 8);
		expected.put("CNET", 7);
		expected.put("Olympics 2012", 2);
		expected.put("Microsoft Bing", 2);
		assertEquals(expected,TopPhrases.getTopPhrases(new File("src/testfile.txt")));
	}
	

	@Test
	public void testLimitedToTwoResult() throws IOException{
		assertEquals(5,TopPhrases.getTopPhrases(new File("src/testfile.txt")).size());
	}
}
