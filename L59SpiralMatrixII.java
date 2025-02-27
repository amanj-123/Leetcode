public class L59SpiralMatrixII {
    //TC=O(n^2) SC=O(1)
        public int[][] generateMatrix(int n) {
            int[][] matrix= new int[n][n];
           int l=0, r=n-1, t=0, b=n-1, k=1;
          
            while(l<=r && t<=b){
              for(int i=l; i<=r; i++){
                matrix[t][i]=k;
                k++;
              } t++;
              for(int i=t; i<=b; i++){
                matrix[i][r]=k;
                k++;
              } r--;
              
              if(t<=b){
                for(int i=r; i>=l; i--){
                  matrix[b][i]=k;
                  k++;  
                } b--;
              }
    
              if(l<=r){
                for(int i=b; i>=t; i--){
                    matrix[i][l]=k;
                    k++;
                } l++;
              }
            }
    
            return matrix;
        }
    }

