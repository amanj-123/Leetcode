public class L238ProductOfArrExceptSelf {
    //TC=O(n) SC=O(1) 
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int pre=1, pos=1;
        int[] result= new int[n];
        for(int i=0; i<n; i++){
         result[i]=pre;
         pre=nums[i]*pre;
        }

        for(int i=n-1; i>=0; i--){
         result[i]=pos*result[i];
         pos=nums[i]*pos;
        }
        return result;
 } 
}
