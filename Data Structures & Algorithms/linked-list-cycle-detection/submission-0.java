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
    public boolean hasCycle(ListNode head) {
        Set<ListNode> s = new HashSet<>();
        if(head == null || head.next == null){
            return false;
        }
        ListNode curr = head;
        while(curr!=null){
            if(s.contains(curr)){
                return true;
            }
            s.add(curr);
            curr = curr.next;
        }
        return false;
    }
}
