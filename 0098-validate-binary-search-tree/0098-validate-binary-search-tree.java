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

    public boolean valid(TreeNode root, long min, long max){
        if(root==null){
            return true;
        }
        if(root.val<=min || root.val>=max){
            return false;
        }
        return valid(root.left,min,root.val) && valid(root.right,root.val,max);

    }

    public boolean isValidBST(TreeNode root) {
        if(root==null){
            return true;
        }

        Long max = Long.MAX_VALUE;
        Long min = Long.MIN_VALUE;


        return valid(root, min, max);

    }
}