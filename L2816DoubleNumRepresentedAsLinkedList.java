package LinkedList;
import java.math.BigInteger;
public class L2816DoubleNumRepresentedAsLinkedList {
//TC=O(n) SC=O(n)
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    
    public ListNode doubleIt(ListNode head) {
        ListNode temp= head;
        StringBuilder sb= new StringBuilder();
        while(temp!=null) {
           sb=sb.append(temp.val);
            temp= temp.next;
        }
        BigInteger num = new BigInteger(sb.toString());
        num = num.multiply(BigInteger.TWO); // Double the number

        // Convert the result back to a linked list
        String s = num.toString();
        ListNode head1 = new ListNode(Character.getNumericValue(s.charAt(0)));
        ListNode curr = head1;

        for (int i = 1; i < s.length(); i++) {
            curr.next = new ListNode(Character.getNumericValue(s.charAt(i)));
            curr = curr.next;
        }
        return head1;
    }
}
