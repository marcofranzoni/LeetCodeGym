package it.marcofranzoni.invert_binary_tree;

public class Solution {
	public TreeNode invertTree(TreeNode root) {
		return recursiveInvert(root);
	}

	private TreeNode recursiveInvert(TreeNode node) {
		if (node == null) {
			return null;
		}

		return new TreeNode(node.val, recursiveInvert(node.right), recursiveInvert(node.left));
	}

}
