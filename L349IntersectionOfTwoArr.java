import java.util.HashSet;
import java.util.Set;

public class L349IntersectionOfTwoArr {
    // TC=O(m+n) SC=(m+n) in worse case 
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set= new HashSet<>();
        Set<Integer> result= new HashSet<>();
        for(int ele: nums1) set.add(ele);
        for(int ele : nums2) {
            if(set.contains(ele)) result.add(ele);
        }
        int[] arr= new int[result.size()];
        int i=0;
        for(int ele: result) arr[i++]=ele;
        return arr;
    }
}
