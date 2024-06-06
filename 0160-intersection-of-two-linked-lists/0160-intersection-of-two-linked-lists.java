/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }
        if(headA == headB){
            return headA;
        }
        
        ListNode tempA = headA;
        ListNode tempB = headB;
        
        while( tempA != tempB){
    	//for the end of first iteration, we just reset the pointer to the head of another linkedlist
        tempA = tempA == null? headB : tempA.next;
        tempB = tempB == null? headA : tempB.next;    
    }
    
    return tempA;
    }
}