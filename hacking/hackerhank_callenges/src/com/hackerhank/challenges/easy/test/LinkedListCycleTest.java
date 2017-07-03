package com.hackerhank.challenges.easy.test;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

import static com.hackerhank.challenges.easy.LikedListCycle.*;

public class LinkedListCycleTest {

	@Test
//	@Ignore
	public void shouldReturnTrue() {
		Node node = new Node(1);
		node.next = new Node(2);
		node.next.next = new Node(3);
		node.next.next.next = node;
		assertTrue(hasCycle(node));
	}
	@Test
//	@Ignore
	public void shouldReturnFalseWithLastNodeLinkedToSecondNode() {
		Node node = new Node(1);
		node.next = new Node(2);
		node.next.next = new Node(3);
		node.next.next.next = node.next;
		assertTrue(hasCycle(node));
	}
	@Test
//	@Ignore
	public void shouldReturnFalse() {
		Node node = new Node(1);
		node.next = new Node(2);
		node.next.next = new Node(3);
		node.next.next.next = new Node(4);
		assertFalse(hasCycle(node));
	}
	@Test
//	@Ignore
	public void shouldReturnFalseWithNextNull() {
		Node node = new Node(1);
		node.next = null;
		assertFalse(hasCycle(node));
	}
	@Test
//	@Ignore
	public void shouldReturnFalseWithNullHead() {
		Node node = null;
		assertFalse(hasCycle(node));
	}

}
