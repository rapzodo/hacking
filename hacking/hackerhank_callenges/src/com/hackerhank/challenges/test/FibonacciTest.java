package com.hackerhank.challenges.easy.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class FibonacciTest {

	@Test
	public void shouldReturnTwo() {
		int n = 3;
		int fib = 0;
		for(int i = 0 ; i <= n ; i++){
			fib = fibonacci(i);
		}
		assertEquals(2, fib);
	}
	@Test
	public void shouldReturnZero() {
		int n = 0;
		assertEquals(0, fibonacci(n));
	}
	
	public int fibonacci(int n){
		if(n == 0 || n == 1){
			return n;
		}
		return fibonacci(n-1)
				+fibonacci(n-2);
	}

}
