import java.util.ArrayList;
import java.util.List;

public class L39CombinationSum {
     //TC=O(2^T)  SC=O(T+2^T)  T refers to target value
     public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result= new ArrayList<>();
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
           combination.add(candidates[i]);
           backTrack(candidates,target-candidates[i], i, combination, result);
           combination.remove(combination.size()-1);
        }
    }
}
