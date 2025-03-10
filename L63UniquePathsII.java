public class L63UniquePathsII {
    //TC=O(m*n) SC=O(n)
    public int uniquePathsWithObstacles(int[][] grid) {
        int m=grid.length, n= grid[0].length;
        if(grid[0][0]==1 || grid[m-1][n-1]==1) return 0;

        int[] dp= new int[n];
        dp[0]=1;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j]==1) dp[j]=0;
                else if(j>0) dp[j]+=dp[j-1];
            }
        }
        return dp[n-1];
    }
}
