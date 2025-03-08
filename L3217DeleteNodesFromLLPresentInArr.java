package LinkedList;

import java.util.HashSet;
import java.util.Set;

public class L3217DeleteNodesFromLLPresentInArr {
     //TC=O(n) SC=O(n)
     public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> set= new HashSet<>();
        for(int ele : nums)  set.add(ele);
        ListNode dummy= new ListNode(0);
        dummy.next= head;
        ListNode curr= head, prev=dummy;
        while(curr!=null){
            if(set.contains(curr.val)){
                prev.next= curr.next;
            } else prev=curr;
            curr=curr.next;
        }
        return dummy.next;
    }
}