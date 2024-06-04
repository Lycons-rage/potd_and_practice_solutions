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
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }

        ListNode mid = findMid(head);
        ListNode head1 = head;
        ListNode head2 = reverseLL(mid);
        
        while (head1 != null && head2 != null) {
            
                ListNode temp = head1.next;
                head1.next = head2;
                head1 = temp;
            
                temp = head2.next;
                head2.next = head1;
                head2 = temp;
        }

        if (head1 != null) {
            head1.next = null;
        }
    }

    private static ListNode findMid(ListNode head) {
        ListNode temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        temp = head;
        if (count % 2 == 0) {
            for (int i = (count / 2) + 1; i <= count; i++) {
                temp = temp.next;
            }
        } else {
            for (int i = 0; i < count / 2; i++) {
                temp = temp.next;
            }
        }
        return temp;
    }

    private static ListNode reverseLL(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode prev = null;
        ListNode pres = head;
        ListNode next = pres.next;

        while (pres != null) {
            pres.next = prev;
            prev = pres;
            pres = next;
            if (next != null) {
                next = next.next;
            }
        }
        return prev;
    }
}