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
        
        acc.add(root.val);
        
        if(root.left != null && root.right != null) {
            //append the left branch and then the right branch
            return inorderTraversalAcc(root.right, inorderTraversalAcc(root.left, acc));
        } else if(root.left != null) {
            //append the left branch
            return inorderTraversalAcc(root.left, acc);
        } else if(root.right != null) {
            //append the right branch
            return inorderTraversalAcc(root.right, acc);
        } else return acc;
    }
}