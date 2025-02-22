import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class L350IntersectionOfTwoArrII {
    //TC=O(m+n) SC=O(min(m,n))
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> arr= new ArrayList<>();
        Map<Integer,Integer> map= new HashMap<>();
        for(int ele: nums1){
            map.put(ele, map.getOrDefault(ele,0)+1);
        }

        for(int ele: nums2){
            if(map.containsKey(ele) && map.get(ele)>0){
             arr.add(ele);
             map.put(ele,map.get(ele)-1);
            }
        }
       return arr.stream().mapToInt(i -> i).toArray();
    }
}
