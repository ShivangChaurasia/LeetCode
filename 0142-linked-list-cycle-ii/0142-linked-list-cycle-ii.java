/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode temp = head;
        ListNode temp1 = head;
        if(head==null|| head.next==null){
            return null;
        }
        while(temp1!=null && temp1.next!=null){
            temp=temp.next;
            temp1 = temp1.next.next;
            if(temp1 == temp){
                break;
            }
        }
        if(temp1!=temp){
            return null;
        }
        ListNode temp2 = head;
        while(temp1!=temp2){
            temp2=temp2.next;
            temp1=temp1.next;
        }
        return temp1;
    }
}