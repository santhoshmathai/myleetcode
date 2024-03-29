package com.myprogram;

public class MaxDepthOfBinaryTree {

	private class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		public TreeNode() {
			
		}
		public TreeNode(int val, TreeNode left, TreeNode right) {
			super();
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}
	
	public int maxDepth(TreeNode root) {
		if(root == null) {
			return 0;
		}
		int left = maxDepth(root.left);
		int right = maxDepth(root.right);
		
		return Math.max(left, right) + 1;
	}
}
