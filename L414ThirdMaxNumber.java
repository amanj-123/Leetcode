public class L414ThirdMaxNumber {
     //TC=O(n) SC=O(1)
     public int thirdMax(int[] nums) {
        long max1=Long.MIN_VALUE, max2=Long.MIN_VALUE, max3=Long.MIN_VALUE;
        for(int num: nums){
        if(num==max1 || num==max2 || num==max3) continue;
        if(num>max1){
          max3=max2;
          max2=max1;
          max1=num;
        } else if(num>max2){
          max3=max2;
          max2=num;
        } else if(num>max3) max3=num;
        } 
        return (max3==Long.MIN_VALUE) ? (int)max1 : (int)max3;
      }
}



//TC=O(nlogn) SC=O(n)
// public int thirdMax(int[] nums) {
//     TreeSet<Integer> set= new TreeSet<>();  
//    for(int ele: nums) set.add(ele);   // add ele in ascending order with TC=O(nlogn)
//    if(set.size()<3) return set.last();
//    else return set.lower(set.lower(set.last()));
// }
 //TC=O(nlogn) SC=O(m)
// public int thirdMax(int[] nums) {
//     Set<Integer> set= new HashSet<>();
//    for(int ele: nums) set.add(ele);
//    int[] arr= new int[set.size()];
//    int i=0;
//    for(int ele: set) arr[i++]=ele;
//    Arrays.sort(arr);
//    if(arr.length==1) return arr[0];
//    else if(arr.length==2) return arr[1];
//    else return arr[arr.length-3];
// }