package LinkedList;

import java.util.Arrays;

public class L2326SpiralMatrixIV {
    //TC=O(m*n) SC=O(1)
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] mat= new int[m][n];
        for(int[] row: mat) Arrays.fill(row,-1);
        int t=0, b=m-1,l=0,r=n-1;
        ListNode curr= head;
        while(t<=b && l<=r && curr!=null){

            for(int i=l;i<=r && curr!=null; i++){
                mat[t][i]= curr.val;
                curr= curr.next;
            } t++;

            for(int i=t; i<=b && curr!=null; i++){
                mat[i][r]= curr.val;
                curr= curr.next;
            } r--;

            for(int i=r; i>=l && curr!=null; i--){
                mat[b][i]= curr.val;
                curr= curr.next;
            } b--;

            for(int i=b; i>=t && curr!=null; i--){
                mat[i][l]= curr.val;
                curr= curr.next;
            } l++;
        }
        return mat;
    }
}
