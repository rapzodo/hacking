package com.hackerhank.challenges.medium;

import java.util.Stack;

public class MyQueue<T> {
	Stack<T> stackNewestOnTop = new Stack<T>();
	Stack<T> stackOldestOnTop = new Stack<T>();

	public void enqueue(T value) { // Push onto newest stack
		stackNewestOnTop.push(value);
	}

	public T peek() {
		putOldestFirst(stackNewestOnTop, stackOldestOnTop);
		return stackOldestOnTop.peek();

	}

	public T dequeue() {
		putOldestFirst(stackNewestOnTop, stackOldestOnTop);
		return stackOldestOnTop.pop();
	}
	
	private void putOldestFirst(Stack<T> stack, Stack<T> queue){
		if(queue.isEmpty()){
			while(!stack.isEmpty()){
				queue.push(stack.pop());
			}
		}
	}
}
