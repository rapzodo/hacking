package com.hackerhank.challenges.medium.test;

import static org.junit.Assert.*;

import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

import org.junit.Test;

public class TagsTest {

	@Test
	public void test() {
		String TAG_REGEX = "</*\\w+>";
		String string = "<h1><h2>Nayeem loves counseling</h2></h1><h3>something else</h3>";
		Matcher m = Pattern.compile(TAG_REGEX).matcher(string);
		Stack<String> tags = new Stack<>();
		while(m.find()){
			tags.push(m.group());
		}
		System.out.println(tags);
//		String[] split = string.split(TAG_REGEX);
//		Stream.of(split).forEach(s-> {
//			if(!s.isEmpty()){
//				System.out.println(s);
//			}
//		}
//		);
//		System.out.println(string.replaceAll(TAG_REGEX, ""));
//		assertEquals(2, split.length);
	}

}
