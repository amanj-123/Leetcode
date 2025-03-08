package LinkedList;

public class L148SortList {
     //TC=O(nlogn) SC=O(n)
     public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
     public ListNode merge(ListNode l1, ListNode l2){
        ListNode dummy= new ListNode(0);
        ListNode t= dummy;
        ListNode t1=l1, t2= l2;
        while(t1!=null && t2!= null){
            if(t1.val<t2.val){
                t.next= t1;
                t1= t1.next;
            } else {
                t.next=t2;
                t2= t2.next;
            } t= t.next;
        }
            if(t1==null) t.next=t2;
               else t.next=t1;
               return dummy.next;
        }
         public ListNode sortList(ListNode head){
            if(head== null || head.next==null) return head;
             ListNode firstHalf= head;
            ListNode slow= head, fast=head;
            while( fast.next!=null && fast.next.next!=null){
                slow= slow.next;
                fast= fast.next.next;
            }
            ListNode secondHalf= slow.next;
            slow.next= null;

            firstHalf= sortList(firstHalf);
            secondHalf= sortList(secondHalf);

           return  merge(firstHalf, secondHalf);
        
         }
}
