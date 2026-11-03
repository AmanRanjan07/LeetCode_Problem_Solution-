class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        // 1. Find the middle of the linked list
        ListNode mid = middleNode(head);
        
        // 2. Reverse the second half of the linked list
        ListNode headSecond = reverseList(mid);
        ListNode reverseHead = headSecond; // Keep a reference to reverse it back later (optional)

        // 3. Compare the first half and the reversed second half
        ListNode first = head;
        ListNode second = headSecond;
        boolean result = true;
        
        while (second != null) {
            if (first.val != second.val) {
                result = false;
                break;
            }
            first = first.next;
            second = second.next;
        }

        // (Optional) Restore the list to its original state
        reverseList(reverseHead);

        return result;
    }

    // Helper method to find the middle node
    private ListNode middleNode(ListNode head) {
        ListNode s = head;
        ListNode f = head;
        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }
        return s;
    }

    // Helper method to reverse a linked list
    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode present = head;
        while (present != null) {
            ListNode next = present.next;
            present.next = prev;
            prev = present;
            present = next;
        }
        return prev;
    }
}

// Asked in the goggle and facebook level....
