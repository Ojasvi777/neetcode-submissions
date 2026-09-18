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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null && n == 1){
            head = null;
            return head;
        }
        ListNode s = head;
        ListNode f = head;
        int count = 0;

        while(f != null && f.next != null){
            s = s.next;
            f = f.next.next;
            count++;
        }
        int index = 0;
        if(f == null){
         index = count*2 - n + 1 ;
        }
        else{
         index = count*2 - n + 2 ;    
        }

        if(index == 1){
            head = head.next;
            return head;
        }
        int check = count+ 1;

        if(check<index){
            for(int i = 0; i < (index - count-2); i++){
                s = s.next;
            }
            s.next = s.next.next;
        }
        else{
            f = head;
            for(int i = 0; i < index-2; i++){
                f = f.next;
            }
            f.next = f.next.next;
        }
        return head;
    }
}
