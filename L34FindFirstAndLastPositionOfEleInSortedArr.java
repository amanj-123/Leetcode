public class L34FindFirstAndLastPositionOfEleInSortedArr {
    //TC=O(logn) SC=O(1)
    public int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums, target);
         int last = findLast(nums, target);
       return new int[]{first,last};
     }
      private int findFirst(int[] nums, int target){
           int n=nums.length;
         int l=0, h=n-1, first=-1;
         while(l<=h){
             int m=(l+h)/2;
             if(nums[m]==target){
                 first=m;
                 h=m-1;
             }  else if(nums[m]<target) l=m+1;
               else h=m-1;
         }
         return first;
      }
 
       private int findLast(int[] nums, int target){
           int n=nums.length;
         int l=0, h=n-1, last=-1;
         while(l<=h){
             int m=(l+h)/2;
             if(nums[m]==target){
                 last=m;
                 l=m+1;
             }  else if(nums[m]<target) l=m+1;
               else h=m-1;
         }
         return last;
      }
}
