package LinkedList;

public class L287FindTheDuplicateNum {
//TC=O(n) SC=O(1)
public int findDuplicate(int[] nums) {
    int slow=nums[0];
    int fast= nums[nums[0]];
    while(slow!=fast){
        slow=nums[slow];
        fast=nums[nums[fast]];
    }
    slow=0;
    while(slow!=fast){
        slow= nums[slow];
        fast=nums[fast];
    }
    return slow;
} 
}

//  // TC=O(n) SC=O(1) But we modify the array
//  public void swap(int[] nums, int i, int j){
//     int temp= nums[i];
//     nums[i]=nums[j];
//     nums[j]=temp;
// }
// public int findDuplicate(int[] nums){
//    while(true){
//      int ele= nums[0];
//      if(ele==nums[ele]) return ele;
//      swap(nums, 0,ele);
//    }
// }  