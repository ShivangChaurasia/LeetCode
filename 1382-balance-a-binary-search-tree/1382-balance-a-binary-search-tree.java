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
    public void inorder(TreeNode root, List<Integer> ls){
        if(root==null){
            return;
        }
        inorder(root.left,ls);
        ls.add(root.val);
        inorder(root.right,ls);
        
    }
    
    public TreeNode tree(List<Integer> ls, int st, int end){
        if(st>end){
            return null;
        }
        int mid = st + (end - st)/2;
        TreeNode root = new TreeNode();
        root.val = ls.get(mid);
        root.left = tree(ls, st, mid-1);
        root.right = tree(ls, mid+1, end);
        return root;
    }

    public TreeNode balanceBST(TreeNode root) {
        if(root==null){
            return null;
        }

        List<Integer> ls = new ArrayList<>();
        inorder(root, ls);

        return tree(ls,0,ls.size()-1);



    }
}