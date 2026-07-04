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
       HashSet<ListNode> visitedNodes = new HashSet<>();
       ListNode current = head;
       if(head==null){
        return false;
       }
       while(current.next!=null){
          if(visitedNodes.contains(current)){
            return true;
          }
          visitedNodes.add(current);
          current = current.next;
       }
       
       return false;
    }
}
