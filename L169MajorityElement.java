import java.util.HashMap;
import java.util.Map;

public class L169MajorityElement {
      // TC=O(n) SC=O(n)
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map= new HashMap<>();
        for(int ele: nums){
          if(map.containsKey(ele)){
            int freq= map.get(ele);
            map.put(ele, freq+1);
          } else map.put(ele,1);
        }
          int maxKey=-1, maxCount=0;
          for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue()>maxCount){
                maxCount=entry.getValue();
                maxKey=entry.getKey();
            }
          }
          return maxKey;
    }
}

//TC=O(nlogn)
// public int majorityElement(int[] nums) {
//     Arrays.sort(nums);
//     return nums[nums.length/2];
// }
