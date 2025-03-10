package LinkedList;

public class L328OddEvenLinkedList {
    //TC=O(n) SC=O(1)
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode odd= head;
        ListNode even= head.next, evenHead= even;
        while(even!=null && even.next!=null){
            odd.next= even.next;
            odd=odd.next;
        
            even.next= odd.next;
            even=even.next;
        }
        odd.next= evenHead;
        return head;
    }
}
