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
    public ListNode removeNodes(ListNode head) {
        return recursiveApproach(head);
    }
    
    private static ListNode recursiveApproach(ListNode head){
        if (head == null || head.next == null){
            return head;
        }
        
        ListNode nextNode = recursiveApproach(head.next);
        
        if(head.val < nextNode.val){
            return nextNode;
        } else {
            head.next = nextNode;
        }
        
        return head;
    }
}