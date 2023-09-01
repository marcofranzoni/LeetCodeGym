package it.marcofranzoni.invert_binary_tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class SolutionTest {

	private final Solution invertBinaryTree = new Solution();

	@Test
	public void emptyTreeShouldReturnEmptyTreeNode() {
		TreeNode invertedTree = invertBinaryTree.invertTree(new TreeNode());

		assertEquals(0, invertedTree.val);
		assertNull(invertedTree.left);
		assertNull(invertedTree.right);

	}

	@Test
	public void oneLevelTreeNode() {
		TreeNode root = new TreeNode(2, new TreeNode(1), new TreeNode(3));

		TreeNode invertedTree = invertBinaryTree.invertTree(root);

		assertEquals(2, invertedTree.val);
		assertEquals(3, invertedTree.left.val);
		assertEquals(1, invertedTree.right.val);
	}

	@Test
	public void twoLevelsTreeNode() {
		TreeNode leftTree = new TreeNode(2, new TreeNode(1), new TreeNode(3));
		TreeNode rightTree = new TreeNode(7, new TreeNode(6), new TreeNode(9));
		TreeNode root = new TreeNode(4, leftTree, rightTree);

		TreeNode invertedTree = invertBinaryTree.invertTree(root);

		assertEquals(4, invertedTree.val);

		assertEquals(7, invertedTree.left.val);
		assertEquals(2, invertedTree.right.val);

		assertEquals(9, invertedTree.left.left.val);
		assertEquals(6, invertedTree.left.right.val);

		assertEquals(3, invertedTree.right.left.val);
		assertEquals(1, invertedTree.right.right.val);
	}


}