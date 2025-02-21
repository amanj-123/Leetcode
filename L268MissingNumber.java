public class L268MissingNumber {
    public int missingNumber(int[] nums) {
        int n= nums.length;
     int totalSum= n*(n+1)/2;
     int sum=0;
     for(int ele: nums)   sum+=ele;
     return totalSum-sum;
    }
}


 //TC=O(n) SC=O(n)
//  public int missingNumber(int[] nums) {
//     boolean[] arr= new boolean[nums.length+1];
//     for(int ele:nums) arr[ele]=true;
//     for(int i=0; i<=nums.length; i++){
//       if(arr[i]==false) return i;
//     }
//     return 55415;
//   }