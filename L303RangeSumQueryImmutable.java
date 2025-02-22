public class L303RangeSumQueryImmutable {
      //TC=O(n) SC=O(n)
        int[] arr;
public void NumArray(int[] nums) {   // on leetcode remove keyword 'void'
   arr=new int[nums.length];
   arr[0]=nums[0];
   for(int i=1; i<nums.length; i++)
   arr[i]=nums[i]+arr[i-1];
}

public int sumRange(int left, int right) {
  if(left==0) return arr[right];
   return arr[right]-arr[left-1];
}
}


