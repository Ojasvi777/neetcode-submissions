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

class Solution {
    public void reorderList(ListNode head) {
        ListNode s = head;
        ListNode f = head;
        
        ListNode shead = null;
        while(f != null && f.next!=null ){
            s = s.next;
            f = f.next.next;
        }

        shead = s.next;
        s.next = null;
        ListNode curr = shead;
        ListNode next = null;
        ListNode next2 = null;
        ListNode prev = null;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        shead = prev;
        curr = head;
        while(prev != null  && curr != null){
            next = curr.next;
            next2 = prev.next;
            curr.next = prev;
            prev.next = next;
            curr = next;
            prev = next2;
        }
    }
}
