public class L152MaximumProductSubArr {
    //TC=O(n) SC=O(1)
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int max=nums[0], min=nums[0], result=max;
        for(int i=1; i<n; i++){
            int curr=nums[i];
            int temp= Math.max(curr, Math.max(curr*max, curr*min));
            min=Math.min(curr,Math.min(curr*min, curr*max));
            max=temp;
            result=Math.max(result,max);
        }
        return result;
    }
}
