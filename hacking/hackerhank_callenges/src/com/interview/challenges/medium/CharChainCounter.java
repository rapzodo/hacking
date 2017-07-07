package com.challenges.spotify;

import java.util.Stack;
import java.util.concurrent.atomic.AtomicInteger;

public class CharChainCounter {

	public static String transform(String input) {
		StringBuilder newString = new StringBuilder();
		final AtomicInteger counter = new AtomicInteger(0);
		Stack<Character> stack = new Stack<>();
		input.chars().forEach(c ->{
			newString.append(calculateChain(counter, stack, (char)c));
		});
		newString.append(appendLastCharacter(counter, stack));
		return newString.toString();
	}

	private static String appendLastCharacter(final AtomicInteger counter,
			Stack<Character> stack) {
		return ""+stack.pop() + counter.get();
	}

	private static String calculateChain(final AtomicInteger counter, Stack<Character> stack,
			char c2) {
		String result = "";
		if(stack.isEmpty()){
			stack.push(c2);
		}
		if(c2 != stack.peek()){
			result = ""+stack.pop() + counter.getAndSet(0);
			stack.push(c2);
		}
		counter.incrementAndGet();
		return result;
	}

}
