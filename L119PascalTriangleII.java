import java.util.ArrayList;
import java.util.List;

public class L119PascalTriangleII {
      //TC=O(n^2) SC=O(n)
    public List<Integer> getRow(int rowIndex) {
    List<Integer> row= new ArrayList<>();
    for(int i=0; i<=rowIndex; i++){
        row.add(1);
        for(int j=i-1; j>0; j--)
            row.set(j, row.get(j)+row.get(j-1));
    }
    return row;
    }
}


 //TC=O(n^2) SC=O(n^2)
//  public List<Integer> getRow(int rowIndex) {
//     List<List<Integer>> ans= new ArrayList<>();
//     for(int i=0; i<=rowIndex; i++){
//         List<Integer> l= new ArrayList<>();
//         for(int j=0; j<=i; j++){
//             if(j==0 || j==i) l.add(1);
//             else l.add(ans.get(i-1).get(j-1)+ans.get(i-1).get(j));
//         }
//         ans.add(l);
//     }
//     return ans.get(rowIndex);
// }