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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode prev = null;
        ListNode current = head;
        ListNode temp = current;

        // find Last
        ListNode last = head;
        while (last.next != null) {
            last = last.next;
        }
        ListNode terminator = last;
        // last is at the terminating node now

        int count = 1;
        while(current!=terminator) {
            if (count % 2 == 0) {
                temp = current;
                last.next = temp;
                last = last.next;
                prev.next = current.next;
                current = current.next;
                temp.next = null;
            } else {
                prev = current;
                current = current.next;
            }
            count++;
        }
        if(count%2==0){
            temp=current;
            last.next = temp;
            prev.next = current.next;
            temp.next = null;
        }
        return head;
    }
}