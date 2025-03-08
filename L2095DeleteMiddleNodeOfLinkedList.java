package LinkedList;

public class L2095DeleteMiddleNodeOfLinkedList {
    //TC=O(n) SC=O(1)
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
   
    public ListNode deleteMiddle(ListNode head) {
        if(head== null || head.next==null) return null;
        ListNode slow= head;
        ListNode fast= head;
        ListNode prev=null;
        while(fast!=null && fast.next!=null){
          prev=slow;
          slow= slow.next;
          fast= fast.next.next;
        }
        if(prev.next!=null) prev.next= slow.next;
        return head;
      }
}
