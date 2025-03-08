package LinkedList;

import java.util.Stack;

public class L2487RemoveNodesFromLinkedList {
    //TC=O(n) SC=O(n)
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode removeNodes(ListNode head) {
        ListNode temp= head;
        Stack<ListNode> st= new Stack<>();
        while(temp!=null){
            while(!st.isEmpty() && st.peek().val < temp.val) st.pop();
            st.push(temp);
            temp= temp.next;
        }
        ListNode newHead= st.get(0);
        temp= newHead;
        for(int i=1; i<st.size(); i++){
            temp.next= st.get(i);
            temp=temp.next;
        }
        temp.next=null;
        return newHead;
    }
}


// public ListNode removeNodes(ListNode head) {
//     ListNode curr = head;
//     ListNode prev = null;
//     ListNode next;
//     while(curr !=null){
//      next = curr.next;
//      curr.next = prev;
//      prev = curr;
//      curr = next;
//     }

//     ListNode newHead = new ListNode(prev.val);
//     int maxVal = newHead.val;
//     curr = prev.next;

//     while(curr !=null){
//      if(curr.val >= maxVal){
//          ListNode node = new ListNode(curr.val);
//          node.next = next = newHead;
//          newHead = node;
//          maxVal = node.val;
//      }
//      curr = curr.next;
//     }
//     return newHead;
 
//  }