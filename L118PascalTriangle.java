import java.util.ArrayList;
import java.util.List;

public class L118PascalTriangle {
    //TC=O(n^2) SC=O(n^2)
    public List<List<Integer>> generate(int numRows) {
       List<List<Integer>> ans= new ArrayList<>();
       for(int i=0; i<numRows; i++){
        List<Integer> l= new ArrayList<>();
       for(int j=0; j<=i; j++){
        if(j==0 || j==i) l.add(1);
        else l.add(ans.get(i-1).get(j)+ ans.get(i-1).get(j-1));
       } 
       ans.add(l);
       } 
       return ans;
    }
}
