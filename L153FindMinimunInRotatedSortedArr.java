public class L153FindMinimunInRotatedSortedArr {
    //TC=O(logn) SC=O(1)
    public int findMin(int[] nums) {
        int n=nums.length;
        int left=0, right=n-1, ans=nums[0];
        while(left<=right){
            if(nums[left]<nums[right]){
                ans=Math.min(ans,nums[left]);
            }
            int mid=(left+right)/2;
            ans=Math.min(ans,nums[mid]);
            if(nums[left]<=nums[mid]) left=mid+1;
             else right=mid-1;
        }
        return ans;
    }
}
