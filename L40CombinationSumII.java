import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L40CombinationSumII {
      public List<List<Integer>> combinationSum2(int[] candidates, int target) {
         //TC=O(2^n)  SC=O(n) 
        List<List<Integer>> result= new ArrayList<>();
        Arrays.sort(candidates);
        backTrack(candidates,target,0,new ArrayList<>(), result);
        return result;
    }

    public void backTrack(int[] candidates, int target, int start, List<Integer> combination, List<List<Integer>> result){

         if(target==0) {
                result.add(new ArrayList<>(combination));
                return;
            }

            if(target<0) return;
        for(int i=start; i<candidates.length; i++){
            if(i>start && candidates[i]== candidates[i-1]) continue;
           combination.add(candidates[i]);
           backTrack(candidates,target-candidates[i], i+1, combination, result);
           combination.remove(combination.size()-1);
        }
    }
}
