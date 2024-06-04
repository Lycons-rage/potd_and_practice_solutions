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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right){
            return head;
        }

        ListNode current = head;
        ListNode previous = null;

        //skip the first left-1 nodes
        for (int i = 0; i < left-1 && current!=null; i++) {
            previous = current;
            current = current.next;
        }

        ListNode last = previous;
        ListNode newEnd = current;
        ListNode next = current.next;
        for (int i = 0; i < right-left+1 && current!=null; i++) {
            current.next = previous;
            previous = current;
            current = next;
            if(next!=null) {
                next = next.next;
            }
        }

        if(last!=null){
            last.next = previous;
        }else{
            head = previous;
        }
        newEnd.next = current;
        return head;
    }
}