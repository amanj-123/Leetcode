package LinkedList;
import java.util.HashMap;

public class L138CopyListWithRandomPointer {
    class Node {
        int val;
        Node next;
        Node random;
    
        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
   // TC=O(n) SC=O(n)
   HashMap<Node, Node> visit = new HashMap<Node, Node>();

   public Node copyRandomList(Node head) {
       if (head == null)
           return null;
       if (this.visit.containsKey(head)) {
           return this.visit.get(head);
       }
       Node node = new Node(head.val);
       this.visit.put(head, node);
       node.next = copyRandomList(head.next);
       node.random = copyRandomList(head.random);
       return node;

   }
}


//TC=O(n) SC=O(n)
// public Node copyRandomList(Node head) {
//     if(head==null) return null;
//     HashMap<Node,Node> map= new HashMap<>();
//     Node curr= head;
//     while(curr!=null){
//         map.put(curr, new Node(curr.val));
//         curr=curr.next;
//     }
//     curr= head;
//     while(curr!=null){
//         map.get(curr).next= map.get(curr.next);
//         map.get(curr).random= map.get(curr.random);
//         curr= curr.next;
//     }
//     return map.get(head);
// }