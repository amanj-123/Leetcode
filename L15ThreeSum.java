import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L15ThreeSum {
     //TC=O(n^2) AS=O(1)
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0; i<n-2; i++){
            if(nums[i]>0) break;
           if(i>0 && nums[i]==nums[i-1]) continue;
           int left=i+1, right=n-1;
           while(left<right){
            int sum=nums[left]+nums[right]+nums[i];
            if(sum==0) { 
            ans.add(Arrays.asList(nums[i],nums[left], nums[right]));
            while(left<right && nums[left]==nums[left+1]) left++;
            while(left<right && nums[right]==nums[right-1]) right--;

            left++;
            right--;
           } else if(sum<0) left++;
           else right--;
        }
        }
        return ans;
    }
}
