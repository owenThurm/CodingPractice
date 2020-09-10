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
    public int minDiffInBST(TreeNode root) {
        return minDiffInBSTAcc(root, 0);
    }
    
    public int minDiffInBSTAcc(TreeNode root, int difference) {
        
        //if the node is null return the difference
        if(root == null) return difference;
        
        int newDifference = 0;
        int rightDifference = 0;
        int leftDifference = 0;
        
        //find the difference between this node and the node immediately to the right
        if(root.right != null) {
            TreeNode rightBranch = root.right;
            while(rightBranch.left != null) rightBranch = rightBranch.left;
            rightDifference = rightBranch.val - root.val;
        }
        //find the difference between this node and the node all the way to the right of this node's left
        if(root.left != null) {    
            TreeNode leftBranch = root.left;
            while(leftBranch.right != null) leftBranch = leftBranch.right;
            leftDifference = root.val - leftBranch.val;
        }
        //if either of those differences is smaller than the current 
        //smallest difference, replace the difference with the new smaller one
        if(difference == 0 || (rightDifference < difference && rightDifference != 0) || (leftDifference < difference && leftDifference != 0)) {
            if(rightDifference != 0 && (rightDifference < leftDifference || leftDifference == 0)) {
                newDifference =  rightDifference;
            }
            else if(leftDifference != 0) {
                newDifference = leftDifference;
            }
        }
        System.out.println(newDifference);
        //do this for the left and right child
        if(newDifference != 0) {
            return minDiffInBSTAcc(root.right, minDiffInBSTAcc(root.left, newDifference));
        } else return minDiffInBSTAcc(root.right, minDiffInBSTAcc(root.left, difference));
    }
}