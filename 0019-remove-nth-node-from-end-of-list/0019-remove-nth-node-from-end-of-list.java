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
                // edge case
        if (head.next == null) {
            if (n == 1) {
                return null;
            }
            return head;
        }

        // get length
        int len = 1;
        ListNode temp = head;
        while (temp.next != null) {
            len++;
            temp = temp.next;
        }

        // now we have length
        temp = head;
        if (len - n == 0) {
            head = head.next;
            return head;
        }

        for (int i = 1; i < len - n; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;

        return head;
    }
}