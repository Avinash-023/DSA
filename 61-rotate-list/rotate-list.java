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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp=head;
        int len=0;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        if(head==null || k==0) return head;
        if(k%len==0) return head;
        k=k%len;
        temp=head;
        for(int i=0;i<len-k-1;i++){
            temp=temp.next;
        }
        ListNode tail=head;
        while(tail.next!=null){
            tail=tail.next;
        }
        tail.next=head;
        head=temp.next;
        temp.next=null;
        return head;
    }
}