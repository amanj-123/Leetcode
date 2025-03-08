package LinkedList;

public class L86PartitionList {
    //TC=O(n) SC=O(1)
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode partition(ListNode head, int x) {
        ListNode temp= head;
        ListNode a= new ListNode(0);
        ListNode b= new ListNode(0);
        ListNode tempA=a, tempB= b;
        while(temp!=null){
            if(temp.val<x){
                tempA.next=temp;
                tempA= tempA.next;
            } else {
                tempB.next= temp;
                tempB= tempB.next;
            } 
            temp= temp.next;
        }

        tempB.next=null;
        tempA.next= b.next;
        return a.next;
    }
}
