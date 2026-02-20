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

    public void rightView(TreeNode root, List<Integer> ls, int level){
        if(root==null){
            return;
        }
        if(level==ls.size()){
            ls.add(root.val);
        }
        rightView(root.right,ls,level+1);
        rightView(root.left, ls, level+1);
    }
    
    public List<Integer> rightSideView(TreeNode root) {
        List <Integer> ls = new ArrayList<>();
        if(root==null){
            return ls;
        }

        rightView(root, ls, 0);
        return ls;
        
    }
}