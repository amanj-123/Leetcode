public class L53MaximumSubArr {
  //TC=O(n) SC=O(1)
  public int maxSubArray(int[] nums) {
    int sum=0, max=Integer.MIN_VALUE;
   for(int num: nums){  //Kadane's Algorithm
    sum+=num;
    max=Math.max(sum,max);
    if(sum<0) sum=0;
    }
    return max;
}  
}
