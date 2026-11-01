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
        int len = 0;
        ListNode fast = head;
        ListNode slow = head;

        boolean hasCycle = false;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                // ListNode temp = slow;
                // int len
                // len = detectCycle(slow);
                hasCycle = true;
                break;
            }
        }

        if(!hasCycle){
            return null;
        }

        // find the start node 
        // ListNode f = head;
        // ListNode s = head;
          
        // while(len > 0){
        //     s = s.next;
        //     len--;
        // }

        // // keep moving 
        // while(f != s){
        //     f = f.next;
        //     s = s.next;
        // }
        // return s;

        //find the entry point of the cycle
        ListNode ptr = head;
        while(ptr != slow){
            ptr = ptr.next;
            slow = slow.next;
        }
        return ptr;
    }
}