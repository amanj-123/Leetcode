package LinkedList;

public class L147InsertionSortList {
    //TC=O(n^2) SC=O(1)
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode curr = head;
        while (curr != null) {
             ListNode prev = dummy;
            while (prev.next != null && prev.next.val < curr.val) {
                prev = prev.next;
            }
            ListNode temp = curr.next;
            curr.next = prev.next;
            prev.next = curr;
            curr = temp;
        }
        return dummy.next;
    }
}


  //TC=O(n^2) SC=O(n)
//   public void swap(int[] arr, int i, int j){
//     int temp= arr[i];
//     arr[i]=arr[j];
//     arr[j]= temp;  
//      }
// public ListNode insertionSortList(ListNode head) {
//     int n=0;
//     ListNode temp=head;
//     while(temp!=null){
//         n++;
//         temp= temp.next;
//     } temp=head;
//     int[] arr= new int[n];
//     for(int i=0; i<n; i++){
//         arr[i]= temp.val;
//         temp= temp.next;
//     }
//         for(int i= 1; i<n; i++){
//         int j=i;
//         while(j>=1 && arr[j]<arr[j-1]){
//             swap(arr, j, j-1);
//             j--;
//         }
//     }
//     ListNode dummy= new ListNode(0);
//     ListNode curr= dummy;
//     for(int i=0; i<n; i++){
//       curr.next= new ListNode(arr[i]);
//       curr= curr.next; 
//     }
//     return dummy.next;
// }