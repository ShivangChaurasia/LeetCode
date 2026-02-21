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
    public TreeNode insert(TreeNode root, int val){
        if(root==null){
            return null;
        }
        if(root.val>val){
            if(insert(root.left,val)==null){
                root.left = new TreeNode(val);
            }
        }
        else if(root.val<val){
            if(insert(root.right,val)==null){
                root.right = new TreeNode(val);
            }
        }
        return root;
    }


    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null){
            root = new TreeNode(val);
            return root;
        }
        root = insert(root,val);
        return root;
    }
}