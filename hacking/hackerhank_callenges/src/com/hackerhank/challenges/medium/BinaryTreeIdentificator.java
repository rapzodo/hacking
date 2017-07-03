package com.hackerhank.challenges.medium;

public class BinaryTreeIdentificator {

	public boolean checkBST(Node root) {
		return isBST(root, Integer.MAX_VALUE, Integer.MIN_VALUE);
	}
	
	private Boolean isBST(Node root, int max, int min){
		if(root == null) {
			return true;
		}
		if(max <= root.data || min >= root.data){
			return false;
		}
		isBST(root.left, root.data, min);
		isBST(root.right, max, root.data);
		return false;
	}

}
