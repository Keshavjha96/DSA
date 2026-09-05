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

     // Find middle node
    public ListNode findMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
   public ListNode mergeTwoLists(ListNode head1, ListNode head2) {
        if(head1==null || head2==null){
            return head1==null ? head2:head1;
        }
        //case1
        if(head1.val<=head2.val){
            head1.next=mergeTwoLists(head1.next,head2);
            return head1;
        }
        else{
            head2.next=mergeTwoLists(head2.next,head1);
            return head2;
        }
    }
    public ListNode sortList(ListNode head) {
          if (head == null || head.next == null) {
            return head;
        }

        // Find middle
        ListNode middle = findMiddle(head);
        
        // Divide into two halves
        ListNode right = middle.next;
        middle.next = null;

        ListNode left = head;

        // Sort both halves
        left = sortList(left);
        right = sortList(right);

        // Merge sorted halves
        return mergeTwoLists(left, right);
    }
}