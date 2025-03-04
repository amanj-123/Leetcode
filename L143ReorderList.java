package LinkedList;

public class L143ReorderList {
    //TC=O(n) SC=O(n/2)=O(n)
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode middleNode(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!= null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    
    public ListNode reverseList(ListNode head){
        ListNode curr=head;
        ListNode prev=null;
        ListNode Next= head;
        while(curr!=null){
            Next= curr.next;
            curr.next=prev;
            prev=curr;
            curr=Next;
        }
        return prev;
    }
        public void reorderList(ListNode head) {
            ListNode leftMid= middleNode(head);
            ListNode head2= leftMid.next;
            leftMid.next=null;
            head2= reverseList(head2);
            ListNode dummy= new ListNode(-1);
            ListNode temp= dummy;
            while(head!=null && head2!=null){
                temp.next=head;
                head=head.next;
                temp=temp.next;
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
            if(head==null) temp.next=head2;
            if(head2==null) temp.next=head;
            head=dummy.next;
        }
}
