public class L495TeemoAttacking {  //TC=O(n) SC=O(1)
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int totalTime=0;
        if(timeSeries.length==0) return 0;
        for(int i=0; i<timeSeries.length-1; i++)
        totalTime+= Math.min(duration,timeSeries[i+1]-timeSeries[i]);
        return totalTime+duration;   
       }
}
