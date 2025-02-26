public class L45JumpGameII {
   //TC=O(n) SC=O(1)
   public int jump(int[] nums) {
    int n=nums.length;
    int steps=0, farthest=0, currend=0;
      for(int i=0; i<n-1; i++){
          farthest=Math.max(farthest, i+nums[i]);
      if(i==currend) {
          steps++;
          currend=farthest;
          }
      }
      return steps;
  } 
}
