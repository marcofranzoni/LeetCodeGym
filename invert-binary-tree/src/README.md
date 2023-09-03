# 226. Invert Binary Tree
Given the root of a binary tree, invert the tree, and return its root.

## Constraints
Constraints:
1. The number of nodes in the tree is in the range [0, 100].
2. -100 <= Node.val <= 100

## Notes
The fundamental part of a recursive function is the exit statement to stop the recursion.
When a node is null, it means that a leaf has been reached thus we can stop the evaluation.
To reverse the tree, the new tree is created with the original right branch as left tree,
and the original left branch as right tree.
In a earlier version, the original tree was modified, without the creation of a new TreeNode,
but due to the signature of the method (it returns a TreeNode) it's best to construct a new object
without modifying the input one. A void return type would be more appropriate for a function that applies side effects.