package LinkedList;

import java.util.PriorityQueue;

class L23MergeKSortedList {
    public class ListNode { //TC=O(n) SC=O(n)
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
 public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> q= new PriorityQueue<>();
        ListNode dummy= new ListNode(1);
        ListNode merge= dummy;
        for(ListNode list: lists){
            while(list!=null){
            q.add(list.val);
            list=list.next;
            }
        } 
        while(q.size()>0){
         merge.next=new ListNode(q.remove());
         merge=merge.next;
        }
        return dummy.next;
    }
    
}