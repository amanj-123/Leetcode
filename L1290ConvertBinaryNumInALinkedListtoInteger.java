package LinkedList;

public class L1290ConvertBinaryNumInALinkedListtoInteger {
    //TC=O(n) SC=O(1)
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public int getDecimalValue(ListNode head) {
        int num=0;
        while(head!=null){
            num= num<<1 | head.val;
            head= head.next;
        }
        return num;
    }
}


//Tc=O(n) SC=O(n)
// public int getDecimalValue(ListNode head) {
//     StringBuilder sb= new StringBuilder();
//     ListNode temp= head;
//     while(temp!= null){
//         sb= sb.append(temp.val);
//         temp=temp.next;
//     }
//     return Integer.parseInt(sb.toString(),2);
// }