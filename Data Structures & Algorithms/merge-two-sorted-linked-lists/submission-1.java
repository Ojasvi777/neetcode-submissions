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
    public void insert(ListNode curr1, ListNode curr2, ListNode temp){
        temp.next = curr2;
        curr2.next = curr1;
    } 
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null){
            return list2;
        }
        else if (list2 == null){
            return list1;
        }
        ListNode curr1 = null;
        ListNode curr2 = null;
        ListNode curr3 = null;
        if(list1.val<list2.val){
        curr1 = list1;
        curr2 = list2;
        curr3 = list1;
        
        }
        else{
        curr1 = list2;
        curr2 = list1;
        curr3 = list2;
        
        }
        ListNode temp = null;
        ListNode temp2 = null;

        while(curr1 != null && curr2 != null){
        while (curr2!=null && curr1.val > curr2.val){
            temp2 = curr2.next;
            insert(curr1,curr2, temp);
            temp = curr2;
            curr2 = temp2;    
        }
        temp = curr1;
        curr1 = curr1.next;
    }
    if(curr1 == null && curr2 != null){
        temp.next = curr2;
    }

    

     return curr3;
    }
}