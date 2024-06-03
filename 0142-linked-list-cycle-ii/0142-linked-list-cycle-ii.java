/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        int length = 1;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                slow = slow.next;
                while(slow != fast){
                    length++;
                    slow = slow.next;
                }
                break;
            }
        }

        fast = head;
        slow = head;
        if(head!=null){
            while(length>0) {
                slow = slow.next;
                length--;
            }

            while(fast!=slow){
                fast = fast.next;
                if(slow!=null){
                    slow = slow.next;
                }
            }
            return fast;
        }
        return null;
    }
}