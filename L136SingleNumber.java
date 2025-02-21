public class L136SingleNumber {
    //TC= O(n) SC=O(1)
    public int singleNumber(int[] nums){
        int ans=0;
        for(int ele: nums)  ans^=ele;
        return ans;
    }
}