package LinkedList;

public class L109ConvertSortedListToBinarySearchTree {
 //TC=O(nlogn) SC=O(logn)
public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
 
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
 

    public TreeNode sortedListToBST(ListNode head) {
        if(head == null)
        {
            return null;
        }
        if(head.next == null)
        {
            return new TreeNode(head.val);
        }
        ListNode slow = head;
        ListNode fast = head;
        ListNode mid = null;
        while(fast != null && fast.next != null)
        {
            mid = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        mid.next = null;
        TreeNode curr = new TreeNode(slow.val);
        curr.left = sortedListToBST(head);
        curr.right = sortedListToBST(slow.next);
    return curr;
    }
}


// class Solution { //TC=O(nlogn) SC=O(logn)
//     public TreeNode sortedListToBST(ListNode head) {
//         if (head == null)
//             return null;
//         return convertToBst(head, null);
//     }

//     public ListNode mid(ListNode head, ListNode tail) {
//         ListNode slow = head, fast = head;
//         while (fast != tail && fast.next != tail) {
//             slow = slow.next;
//             fast = fast.next.next;
//         }
//         return slow;
//     }

//     public TreeNode convertToBst(ListNode head, ListNode tail) {
//         if (head == tail)
//             return null;
//         ListNode midEle = mid(head, tail);
//         TreeNode root = new TreeNode(midEle.val);
//         root.left = convertToBst(head, midEle);
//         root.right = convertToBst(midEle.next, tail);
//         return root;
//     }
// }