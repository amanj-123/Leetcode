import java.util.HashMap;

public class L219ContainsDuplicateii {
    //TC=O(n) SC=O(n)
    public boolean containsNearbyDuplicate(int[] nums, int k) {
     HashMap<Integer,Integer> map= new HashMap<>();
     for(int i=0; i<nums.length; i++){
        if(map.containsKey(nums[i])){
            int prevIdx= map.get(nums[i]);
            if(i-prevIdx<=k) return true;
        }
        map.put(nums[i],i);
     }  
     return false;
    }
}


// TLE error
// public boolean containsNearbyDuplicate(int[] nums, int k) {
//     for(int i=0; i<nums.length-1; i++){
//         for(int j=i+1; j<nums.length; j++){
//             if(nums[i]==nums[j]) {
//                 if(Math.abs(i-j)<=k) {
//                     return true;
//             }  break;
//          }
//         }
//     }
//     return false;
// }