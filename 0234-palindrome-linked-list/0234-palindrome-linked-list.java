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
    public boolean isPalindrome(ListNode head) {
        // find mid
        ListNode mid = findMid(head);

        // reverse second half
        ListNode secondHead = reverseLL(mid);
        ListNode revHead = secondHead;

        while (head != null && secondHead != null) {
            if (head.val != secondHead.val) {
                break;
            }
            head = head.next;
            secondHead = secondHead.next;
        }

        return head == null || secondHead == null;
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