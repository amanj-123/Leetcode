import java.util.ArrayList;
import java.util.List;

public class L228SummaryRanges {
     //TC=O(n) SC=O(n)
    public List<String> summaryRanges(int[] nums) {
         List<String> arr = new ArrayList<>();
        int start=0, n= nums.length;
        if(n==0) return arr;
        for(int i=1; i<=n; i++){
            if(i==n || nums[i]!=nums[i-1]+1){
                if(start==i-1) arr.add(String.valueOf(nums[start]));
                else arr.add(nums[start] + "->" + nums[i - 1]); 
                 start=i;
            }
           
        }
        return arr;
    }
}
