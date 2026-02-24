/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public TreeNode insertion(List<Integer> ls, int st, int end){
        if(st>end){
            return null;
        }
        int mid = (st+end)/2;
        TreeNode root = new TreeNode(ls.get(mid));
        root.left = insertion(ls,st,mid-1);
        root.right = insertion(ls,mid+1,end);
        return root;
    }

    public TreeNode sortedListToBST(ListNode head) {
        if(head==null){
            return null;
        }
        List<Integer> ls = new ArrayList<>();
        while(head!=null){
            ls.add(head.val);
            head=head.next;
        }
        int st = 0;
        int end = ls.size()-1;
        return insertion(ls, st, end);
    }
}