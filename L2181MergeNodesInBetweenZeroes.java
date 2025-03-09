package LinkedList;
public class L2181MergeNodesInBetweenZeroes {
    //TC=O(n) SC=O(1)
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy= new ListNode(0);
        ListNode temp= dummy;
        ListNode curr= head.next;
        int sum=0;
        while(curr!=null){
            if(curr.val==0){
              if(sum>0){
                temp.next= new ListNode(sum);
                temp= temp.next;
                sum=0;
              }
            }  else sum+=curr.val;
            curr= curr.next;
        }
        return dummy.next;
    }
}
