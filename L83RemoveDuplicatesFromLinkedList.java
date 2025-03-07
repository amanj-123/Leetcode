package LinkedList;

public class L83RemoveDuplicatesFromLinkedList {
    //TC=O(n) SC=O(1)
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode deleteDuplicates(ListNode head) {
        if(head== null) return head;
        ListNode slow= head;
        ListNode fast=head;
        while(fast!=null){
            if(slow.val== fast.val){
                fast= fast.next;
            } else {
                slow.next= fast;
                slow = fast;
            }
        } 
        slow.next = null;
        return head;
    }
}

