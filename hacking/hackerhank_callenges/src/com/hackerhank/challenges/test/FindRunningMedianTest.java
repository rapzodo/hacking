package com.hackerhank.challenges.hard.test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import com.hackerhank.challenges.hard.FindRunningMedian;

public class FindRunningMedianTest {

	@Test
	public void shouldSortArrayAndReturnListOfResultsAsExpected() {
		int[] dataset = new int[6];
		List<Double> expected = new LinkedList<>();
		List<Double> result = new LinkedList<>();
		Collections.addAll(expected, 12.0,8.0,5.0,4.5,5.0,6.0);
		List<Integer> randomValues = Arrays.asList(12,4,5,3,8,7);
		for (int i = 0; i < dataset.length; i++) {
			dataset[i] = randomValues.get(i);
			result.add(FindRunningMedian.find(dataset[i]));
		}
		assertEquals(expected, result);
	}

}
