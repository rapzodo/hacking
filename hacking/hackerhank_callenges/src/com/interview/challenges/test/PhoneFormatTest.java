package com.zooplus.munich.tasks.test;

import static com.zooplus.munich.tasks.PhoneFormatter.format;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PhoneFormatTest {

	String REGEX = "[0-9]{3}-[0-9]{3}-[0-9]{3}-";
	
	@Test
	public void test() {
		assertEquals("12-34", format("12 3 - 4"));
	}
	@Test
	public void test2() {
		String cleanString = "12 3 - 4 -- 5 6 78";
		assertEquals("123-456-78", format(cleanString));
	}
	@Test
	public void test3() {
		String cleanString = "0 - 22 198 5--324";
		assertEquals("022-198-53-24", format(cleanString));
	}
	
	

}
