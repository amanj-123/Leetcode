public class L11ContainerWithMostWater {
    //TC=O(n) SC=O(1)
    public int maxArea(int[] height) {
        int max=0,l=0, r=height.length-1;
        while(l<r){
              int area=Math.min(height[l], height[r])*(r-l);
              max=Math.max(area,max);
              if(height[l]<height[r]) l++;
              else r--;
        }
        return max;
      }
}
