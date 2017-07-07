package com.hackerhank.challenges.medium.test;

import org.junit.Assert;
import org.junit.Test;

import com.hackerhank.challenges.medium.MyQueue;

public class MyQueueTest {

	private MyQueue<Integer> queue = new MyQueue<>();
	
	@Test
	public void shouldAssert14Twice(){
		queue.enqueue(42);
		queue.dequeue();
		queue.enqueue(14);
		Assert.assertEquals(new Integer(14),queue.peek());
		queue.enqueue(28);
		Assert.assertEquals(new Integer(14),queue.peek());
		queue.enqueue(60);
		queue.enqueue(78);
		queue.dequeue();
		queue.dequeue();
	}
	
}
