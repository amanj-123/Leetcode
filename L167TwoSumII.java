public class L167TwoSumII {
    //TC=O(n) SC=O(1)
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length, l=0,r=n-1;
        while(l<r){
             if(target< nums[l]+nums[r]) r--;
            else if(target > nums[l]+nums[r]) l++;
             else  return new int[] {l+1, r+1};
        }
        return null;
    }
}
