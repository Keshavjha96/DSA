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
    
    static int lengthOfLinkedList(ListNode head) {
    int count = 0;

    ListNode temp = head;

    while (temp != null) {
        count++;
        temp = temp.next;
    }

    return count;
}
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int l=lengthOfLinkedList(head);
        if(n==l){
            return head.next; //head is deleted
        }
        int travel_front=l-n;
        ListNode temp=head;
        ListNode prev=null;
         while(travel_front>0){
            prev=temp;
            temp=temp.next;    
            travel_front--;     
         }
         prev.next=temp.next;
         return head;
    }
}