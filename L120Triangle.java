import java.util.List;

public class L120Triangle {
    //Tc=O(n^2) SC=O(1) Dp bottom up approach
    public int minimumTotal(List<List<Integer>> triangle) {
        int n= triangle.size();
        for(int r= n-2; r>=0; r--){
            for(int c=0; c< triangle.get(r).size(); c++){
                int minpath= Math.min(triangle.get(r+1).get(c), triangle.get(r+1).get(c+1));
                triangle.get(r).set(c, triangle.get(r).get(c)+minpath);
            }
        }
        return triangle.get(0).get(0);
    }
}
