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
    public ListNode removeElements(ListNode head, int val) {
        ListNode curr = head;
        ListNode prev = head;

        return recursive(head, val, curr, prev);
    }

    private static ListNode recursive(ListNode head, int val, ListNode curr, ListNode prev){
        if(head == null || curr == null){
            return head;
        }

        if (curr.val == val) {
            if(curr == head){
                curr = curr.next;
                prev = curr;
                head = curr;
            } else {
                if (prev != null) {
                    prev.next = curr.next;
                }
                curr = curr.next;
            }
        } else if(curr == head){
            curr = curr.next;
        } else{
            prev = curr;
            curr = curr.next;
        }

        return recursive(head, val, curr, prev);
    }
}