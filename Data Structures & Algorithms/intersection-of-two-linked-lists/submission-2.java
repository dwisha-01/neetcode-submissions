public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode current = headA;
        ListNode temp = headB;
        int countA = 0;
        int countB = 0;
        
        // 1. Count nodes in list A
        while(current != null){
            countA++;
            current = current.next;
        }
        
        // 2. Count nodes in list B
        while(temp != null){
            countB++;
            temp = temp.next;
        }
        
        // RESET pointers back to the heads of the lists
        current = headA;
        temp = headB;
        
        // 3. Calculate difference and advance the longer list's pointer
        int d = Math.abs(countA - countB);
        if (countA > countB) {
            for (int i = 0; i < d; i++) {
                current = current.next;
            }
        } else {
            for (int i = 0; i < d; i++) {
                temp = temp.next;
            }
        }
        
        // 4. Move both pointers together until they meet
        while (current != null && temp != null) {
            if (current == temp) {
                return current; // Intersection found
            }
            current = current.next;
            temp = temp.next;
        }
        
        return null; // No intersection found
    }
}
