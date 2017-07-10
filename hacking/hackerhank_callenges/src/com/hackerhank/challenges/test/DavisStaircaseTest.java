package com.hackerhank.challenges.test;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

import com.hackerhank.challenges.medium.DavidStairCase;

public class DavisStaircaseTest {

	@Test
	public void souldReturnOne() {
		assertEquals(Integer.valueOf(1), DavidStairCase.countWays(1));
	}
	@Test
	public void souldReturn4() {
		assertEquals(Integer.valueOf(4), DavidStairCase.countWays(3));
	}
	@Test
	public void souldReturn44() {
		assertEquals(Integer.valueOf(44), DavidStairCase.countWays(7));
	}

}
