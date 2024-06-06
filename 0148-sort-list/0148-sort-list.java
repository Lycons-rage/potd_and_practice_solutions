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
    public ListNode sortList(ListNode head) {
        return mergeSort(head);
    }
    
    private static ListNode mergeSort(ListNode head) {
        // merge sort code....make it recursive
        // breakpoint
        if (head == null || head.next == null) {
            return head;
        }

        // get length and reach to half
        int len = 1;
        ListNode temp = head;
        while (temp.next != null) {
            len++;
            temp = temp.next;
        }

        // now we have current list's length
        // reach to half
        temp = head;
        ListNode h2 = head;
        for (int i = 0; i < len / 2 - 1; i++) {
            temp = temp.next;
        }

        // in a ll such as this, 3 -> 1 -> 2 -> 5
        //                            ^
        //                        temp is here

        h2 = temp.next;
        temp.next = null;
        // link is broken and head 2 is now on beginning on the second part
        // left and right part recursive calls
        ListNode left = mergeSort(head);
        ListNode right = mergeSort(h2);

        // when both these recursive calls end we'll be having 2 sub-lists both having a single node, we gotta merge them now
        head = mergeNodes(left, right);
        return head;
    }

    private static ListNode mergeNodes(ListNode left, ListNode right) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while (left != null && right != null) {
            if (left.val < right.val) {
                curr.next = left;
                left = left.next;
            } else {
                curr.next = right;
                right = right.next;
            }
            curr = curr.next;
        }
        curr.next = (left != null) ? left : right;
        return dummy.next;
    }
}