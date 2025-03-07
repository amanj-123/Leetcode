package LinkedList;

import LinkedList.L2AddTwoNum.ListNode;

public class L206ReverseLinkedList {
    //TC=O(n) SC=O(1)
    public ListNode reverseList(ListNode head) {
        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null){
            ListNode temp= curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
}
