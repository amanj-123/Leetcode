public class L31NextPermutation {
    //TC=O(n) SC=O(1)
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int i=n-2;
        while(i>=0 && nums[i]>= nums[i+1]) i--;
        if(i>=0){
            int j=n-1;
            while(nums[j]<=nums[i]) j--;

            swap(nums, i, j);
        }
        reverse(nums,i+1,n-1);
    }
    public void swap(int[] nums, int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public void reverse(int[] arr, int i, int j){
        while(i<j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }
}
