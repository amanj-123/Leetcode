import java.util.HashMap;
import java.util.PriorityQueue;

public class L347TopKFrequentElements {
    //TC=O(nlogK) SC=O(n)
    public int[] topKFrequent(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int ele : arr) {
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for (int ele : map.keySet()) {
            int freq = map.get(ele);
            pq.add(new Pair(ele, freq));
            if (pq.size() > k) {
                pq.poll(); // Remove the element with the lowest frequency
            }
        }


        int[] ans = new int[k];
        for (int i = k - 1; i >= 0; i--) { // Reverse order to get highest frequency first
            ans[i] = pq.poll().ele;
        }

        return ans;
    }
    public class Pair implements Comparable<Pair> {
        int ele;
        int freq;

        Pair(int ele, int freq) {
            this.ele = ele;
            this.freq = freq;
        }

        public int compareTo(Pair p) {
            return this.freq - p.freq; // Min-Heap based on frequency
        }
    }
}
