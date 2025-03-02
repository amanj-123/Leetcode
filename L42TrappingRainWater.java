public class L42TrappingRainWater {
    //TC=O(n) SC=O(1)
    public int trap(int[] height) {
        int n= height.length;
        int lMax=height[0], rMax=height[n-1], l=0, r=n-1, total=0;
        while(l<r){
            if(height[l]<height[r]){
                lMax=Math.max(height[l],lMax);
            if(lMax-height[l]>0) total=total+lMax-height[l];
            l++;
            }  else {
                rMax=Math.max(height[r],rMax);
                if(rMax-height[r]>0) total+=rMax-height[r];
                r--;
            }
        }
        return total;
    }
}
