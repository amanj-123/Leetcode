package LinkedList;

public class L2130MaxTwinSumOfLinkedlist {
    //TC=O(n) SC=O(1)
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    
    public ListNode rev(ListNode head){
        ListNode prev=null;
        ListNode curr= head;
        while(curr!=null){
            ListNode temp= curr.next;
            curr.next= prev;
            prev= curr;
            curr= temp;
        }
        return prev;
    }
    public int pairSum(ListNode head) {
     ListNode slow= head, fast= head;
     while(fast!=null && fast.next!=null){
        slow= slow.next;
        fast= fast.next.next;
     }   
     ListNode secondHalf= rev(slow);
     ListNode firstHalf= head;
     int maxSum=0;
     while(secondHalf!=null){
        maxSum= Math.max(maxSum, firstHalf.val+ secondHalf.val);
        firstHalf= firstHalf.next;
        secondHalf= secondHalf.next;
     } 
     return maxSum;
    }
}
