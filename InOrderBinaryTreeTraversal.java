/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        return inorderTraversalAcc(root, new ArrayList<Integer>());
    }
    public List<Integer> inorderTraversalAcc(TreeNode root, List<Integer> acc) {
        if(root == null) return acc;
        //append left append current append right
        List<Integer> leftAppendedCur = inorderTraversalAcc(root.left, acc);
        leftAppendedCur.add(root.val);
        return inorderTraversalAcc(root.right, leftAppendedCur);
    }
}