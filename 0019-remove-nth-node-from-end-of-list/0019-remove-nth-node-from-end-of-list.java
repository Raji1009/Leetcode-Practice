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
    public int CalculateSize(ListNode head){
        int size=0;
        ListNode temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        return size;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size =  CalculateSize(head);
        if(size==n){
            head=head.next;
            return head;
        }

        int i=1;
        ListNode prev=head;
        while(i<size-n){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return head;
    }
}