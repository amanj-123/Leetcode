public class L35SearchInsertPosition {
     //TC=O(n) SC=O(1)
     public int searchInsert(int[] nums, int target) {
        if(target>nums[nums.length-1]) return nums.length;

       for(int i=0; i<nums.length; i++){
           if(nums[i]>=target) return i;
       }
        return -1;
   }
}
