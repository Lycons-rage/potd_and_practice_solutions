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
    public ListNode deleteMiddle(ListNode head) {
        ListNode temp = head;
        int count = 0;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        temp = head;
        if(count==0 || count==1){
            return null;
        }
        
        if(count%2==0){
            for(int i=0; i<(count/2)-1; i++){
                temp = temp.next;
            }
        }
        else{
            for(int i=1; i<count/2; i++){
                temp = temp.next;
            }
        }
        temp.next = temp.next.next;
        return head;
    }
}