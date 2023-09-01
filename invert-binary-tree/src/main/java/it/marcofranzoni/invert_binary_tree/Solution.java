package it.marcofranzoni.invert_binary_tree;

public class Solution {
    public TreeNode invertTree(TreeNode root) {

		return recursiveInvert(root);
    }

    private TreeNode recursiveInvert(TreeNode node) {
        if (node == null) {
            return null;
        }

        if (node.left != null || node.right != null) {
            TreeNode temp = node.left;
            node.left = recursiveInvert(node.right);
            node.right = recursiveInvert(temp);
        }

        return node;

    }


}
