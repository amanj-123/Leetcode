import java.util.HashSet;
import java.util.Set;

public class L217ContainsDuplicate {
//TC=O(n) SC=O(n)
    public boolean containsDuplicate(int[] nums) {
      Set<Integer> arr= new HashSet<>();
      for(int ele: nums){
        if(!arr.add(ele)) return true;
      }       
      return false;
    }    
}


// TC= O(n^2) SC=O(1)  TLE
// public boolean containsDuplicate(int[] nums) {
//     for(int i=0; i<nums.length-1; i++){
//         for(int j=i+1; j<nums.length; j++)
//         if(nums[i]==nums[j]) return true;
//     }
//     return false;
// }