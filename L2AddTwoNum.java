package LinkedList;

public class L2AddTwoNum {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
   //TC=O(max(l1,l2))  SC=O(max(l1,l2)); 
   public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    int carry=0;
    ListNode dummy= new ListNode(0);
    ListNode ans= dummy;
    while(l1!=null || l2!=null || carry!=0){
        int x= (l1!=null) ? l1.val : 0;
        int y= (l2!=null) ? l2.val: 0;
        int sum= x+y+carry;
        carry=sum/10;
        ans.next= new ListNode(sum%10);
        ans=ans.next;

        if(l1!=null) l1=l1.next;
        if(l2!=null) l2= l2.next;

    }
    return dummy.next;
}
}
