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

    public int height(TreeNode root){
        if(root==null){
            return 0;
        }
        return Math.max(height(root.left)+1,height(root.right)+1);

    }
    public int sum(TreeNode root, int height){
        int totalSum = 0;
        if(root==null){
            return 0;
        }
        if(height==1){
            return root.val;
        }
        totalSum+=sum(root.left,height-1);
        totalSum+=sum(root.right,height-1);

        return totalSum;

    }
    public int deepestLeavesSum(TreeNode root) {
        if(root==null){
            return 0;
        }
        int Height = height(root);
        int totalSum = sum(root, Height);

        return totalSum;
    }
}