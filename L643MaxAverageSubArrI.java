public class L643MaxAverageSubArrI {
    //TC=O(n) SC=O(1)
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        double maxSum=0, windowSum=0;
        for(int i=0; i<k; i++) windowSum+=nums[i];
        maxSum=windowSum;
        for(int i=k; i<n; i++) {
           windowSum+=nums[i]-nums[i-k];
           maxSum=Math.max(windowSum, maxSum);
        }   
        return maxSum/k;
       }
}
