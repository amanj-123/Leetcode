package LinkedList;

public class L61RotateList {
    //TC=O(n) SC=(1)
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
   
    public ListNode rotateRight(ListNode head, int k) {
        if(head== null || head.next==null) return head;
        ListNode temp=head, slow=head, fast=head;
        int n=0;
        while(temp!=null){
            temp= temp.next;
            n++;
        }
        k=k%n;
        if(k==0) return head;
        for(int i=1; i<=k; i++) fast= fast.next;
        while(fast.next!=null){
            slow= slow.next;
            fast= fast.next; 
        }
        ListNode newHead= slow.next;
        slow.next=null;
        fast.next=head;
        return newHead;
    }
}
