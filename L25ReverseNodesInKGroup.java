package LinkedList;

class L25ReverseNodesInKGroup {
//TC=O(n) SC=O(n)
public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public ListNode reverseKGroup(ListNode head, int k) {
    ListNode curr= head;
    int count=0;
    while(curr!=null && count<k){
        curr=curr.next;
        count++;
    }
    if(k==count){
        curr=head;
        ListNode prev=null, nextNode=null;
        for(int i=0; i<k; i++){
            nextNode= curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextNode;
        } head.next=reverseKGroup(curr,k);
        return prev;
    }
    return head;
   
}
    
}