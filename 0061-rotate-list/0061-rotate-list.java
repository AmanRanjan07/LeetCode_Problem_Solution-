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
    public ListNode rotateRight(ListNode head, int k) {
        // Step 1: Edge cases
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        // Step 2: Find length and tail
        ListNode temp = head;
        int length = 1;
        while (temp.next != null) {
            temp = temp.next;
            length++;
        }

        // Step 3: Optimize k
        k = k % length;
        if (k == 0) return head;

        // Step 4: Make circular
        temp.next = head;

        // Step 5: Find new tail
        int steps = length - k;
        ListNode newTail = head;

        for (int i = 1; i < steps; i++) {
            newTail = newTail.next;
        }

        // Step 6: Break and return
        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }
}