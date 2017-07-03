package com.hackerhank.challenges.easy;

import java.util.HashSet;
import java.util.Set;

public class LikedListCycle {
	
	
	public static Boolean hasCycle(Node node) {
		Set<Node> set = new HashSet<>();
		if(node == null){
			return false;
		}
		set.add(node);
		while(node.next != null){
			node = node.next;
			if(!set.add(node)){
				return true;
			}
		}
		return false;
	}

	public static class Node {
		
		public int data;
		public Node next;
		
		public Node(int data){
			this.data=data;
		}
	}
}