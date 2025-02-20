public class L27RemoveElement {
    //TC=O(n) SC=O(1)
    public int removeElement(int[] nums, int val) {
        int count=0;
        for(int i=0; i<nums.length; i++)
        if(nums[i]!=val){
            nums[count]=nums[i];
            count++;
        }

        return count;
    }
}
