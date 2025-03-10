package LinkedList;

import java.util.Stack;

public class L1019NextGreaterNodeInLinkedList {
    //TC=O(n) SC=O(n)
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public int[] nextLargerNodes(ListNode head) {
        ListNode temp= head;
        int n=0;
        while(temp!=null){
            n++;
            temp= temp.next;
        } 
        temp=head;
        int[] arr= new int[n];
        for(int i=0; i<n; i++){
            arr[i]= temp.val;
            temp=temp.next;
    }
      int[] result= new int[n];
      Stack<Integer> st= new Stack<>();
      for(int i=0; i<n; i++){
      while(!st.isEmpty() && arr[st.peek()]< arr[i]){
        result[st.pop()]= arr[i];
      } st.push(i);
      }
       while(!st.isEmpty()){
        result[st.pop()]=0;
       }
       return result;
    }
}
