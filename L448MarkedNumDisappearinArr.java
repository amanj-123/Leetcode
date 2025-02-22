import java.util.ArrayList;
import java.util.List;

public class L448MarkedNumDisappearinArr {
    //TC=O(n) SC=O(1)
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans= new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            int idx= Math.abs(nums[i])-1;
            if(nums[idx]>0) nums[idx]=-nums[idx];
        }
        for(int i=0; i<nums.length; i++){
            if(nums[i]>0) ans.add(i+1);
        }
        return ans;
    }
}


 //Tc=O(n) SC=O(n)
//  public List<Integer> findDisappearedNumbers(int[] nums) {
//     Set<Integer> set= new HashSet<>();
//     ArrayList<Integer> arr = new ArrayList<>();
//     for(int ele:nums) set.add(ele);
//     int n= nums.length;
//     for(int i=1; i<=n; i++){
//         if(!set.contains(i)) arr.add(i);
//     }
//     return arr;
// }