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
           if (k <= 0 || head == null || head.next == null) {
            return head;
        }
        // find length
        int len = 1;
        ListNode last = head;
        while (last.next != null) {
            len++;
            last = last.next;
        }

        for (int i = 0; i < k % len; i++) {
            ListNode temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            ListNode req = deleteFromEnd(temp);
            head = insertIntoHead(req, head);
        }

        return head;
    }

    private static ListNode insertIntoHead(ListNode req, ListNode head) {
        req.next = head;
        head = req;
        return head;
    }

    private static ListNode deleteFromEnd(ListNode node) {
        ListNode req = node.next;
        node.next = null;
        return req;
    }
}