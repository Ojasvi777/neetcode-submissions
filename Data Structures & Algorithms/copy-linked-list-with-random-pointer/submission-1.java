/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null){
            return null;
        }
        Node curr = head;
        Map <Node, Node> m = new HashMap<>(); 
        m.put(null, null);
        while(curr != null){
            if(!m.containsKey(curr)){
             m.put(curr, new Node(0));
            }
            m.get(curr).val = curr.val;
        
            if(!m.containsKey(curr.next)){
             m.put(curr.next, new Node(0));
            }
            m.get(curr).next = m.get(curr.next);
        
            if(!m.containsKey(curr.random)){
             m.put(curr.random, new Node(0));
            }
            m.get(curr).random = m.get(curr.random);
            curr = curr.next;
        }
 
        return m.get(head);
    }

}
