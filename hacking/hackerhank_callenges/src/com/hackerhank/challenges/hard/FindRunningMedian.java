package com.hackerhank.challenges.hard;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class FindRunningMedian {

	public static Queue<Integer> maxHeap = new PriorityQueue<>();
	public static Queue<Integer> minHeap = new PriorityQueue<>(Comparator.reverseOrder());

	public static Double find(Integer value) {
		if (minHeap.isEmpty() && maxHeap.isEmpty()) {
			minHeap.offer(value);
			return Double.valueOf(value);
		}
		balance(value);
		checkAndSwapHeaps();
		if (isOdd()) {
			return Double.valueOf(minHeap.peek());
		}
		return Double.valueOf((maxHeap.peek() + minHeap.peek())) / 2;
	}

	private static void balance(Integer value) {
		if (minHeap.size() > maxHeap.size()) {
			maxHeap.offer(value);
		} else {
			minHeap.offer(value);
		}
	}

	private static boolean isOdd() {
		return (minHeap.size() + maxHeap.size()) % 2 != 0;
	}

	private static void checkAndSwapHeaps() {
		Integer temp;
		if (minHeap.peek() > maxHeap.peek()) {
			temp = maxHeap.poll();
			maxHeap.offer(minHeap.poll());
			minHeap.offer(temp);
		} else if (maxHeap.peek() < minHeap.peek()) {
			temp = minHeap.poll();
			minHeap.offer(maxHeap.poll());
			maxHeap.offer(temp);
		}
	}

}
