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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(0);
        ListNode current = ans;
        if (l1 == null) {
            if (l2 == null) {
                return null;
            }
        }

        int sum = 0;
        int answer = 0;
        int carry = 0;

        // for common nodes
        while (l1 != null && l2 != null) {
            sum = l1.val + l2.val + carry;
            if (sum > 9) {
                answer = sum % 10;
                carry = sum / 10;
                insert(current, answer);
                current = current.next;
            } else {
                insert(current, sum);
                carry = 0; // reset carry
                current = current.next;
            }
            l1 = l1.next;
            l2 = l2.next;
        }

        // if sizes extend
        while (l1 != null) {
            sum = l1.val + carry;
            if (sum > 9) {
                answer = sum % 10;
                carry = sum / 10;
                insert(current, answer);
                current = current.next;
            } else {
                insert(current, sum);
                carry = 0; // reset carry
                current = current.next;
            }
            l1 = l1.next;
        }
        while (l2 != null) {
            sum = l2.val + carry;
            if (sum > 9) {
                answer = sum % 10;
                carry = sum / 10;
                insert(current, answer);
                current = current.next;
            } else {
                insert(current, sum);
                carry = 0; // reset carry
                current = current.next;
            }
            l2 = l2.next;
        }
        
        if(carry>0){
            insert(current,carry);
        }

        return ans.next;
    }

    private void insert(ListNode node, int value) {
        node.next = new ListNode(value);
    }
}