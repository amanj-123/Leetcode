package LinkedList;

public class L234PalindromeLinkedList {
    //TC=O(n) SC=O(1)
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode reverse(ListNode head){
        ListNode curr= head, prev= null;
        while(curr!=null){
            ListNode temp= curr.next;
            curr.next= prev;
            prev= curr;
            curr= temp;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true;
        ListNode slow= head, fast= head;
        while(fast!= null && fast.next!= null){
            slow= slow.next;
            fast= fast.next.next;
        }
        ListNode secondHalf= reverse(slow);
        ListNode firstHalf= head;
      //ListNode temp= secondHalf;
        while(secondHalf!=null){
            if(firstHalf.val!=secondHalf.val){
              reverse(secondHalf);
              return false;
            } else {
                firstHalf= firstHalf.next;
                secondHalf= secondHalf.next;
            }
        }
        return true;
    }
}
