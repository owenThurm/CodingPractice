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
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        if(root.left != null && root.right != null && root.left.val != root.right.val) return false;
        return reflectedTree(root.left, root.right);
    }
    
    public boolean reflectedTree(TreeNode p, TreeNode q) {
        if(p == null || q == null) return p == q;
        if(p.left != null && q.right != null && p.left.val != q.right.val) return false;
        if(p.right != null && q.left != null && p.right.val != q.left.val) return false;
        return reflectedTree(p.left, q.right) && reflectedTree(p.right, q.left);
    }
}