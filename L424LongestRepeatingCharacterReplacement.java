package String;
public class L424LongestRepeatingCharacterReplacement {
    //TC=O(n) SC=O(1)
    public int characterReplacement(String s, int k) {
        int ans = 0, maxoccurence = 0, left = 0, right = 0;
        int[] occurence = new int[26];
        for (right=0; right < s.length(); right++) {
            maxoccurence = Math.max(maxoccurence, ++occurence[s.charAt(right)-'A']);
            if ((right - left + 1) - maxoccurence > k) {
                occurence[s.charAt(left) - 'A']--;
                 left++;

            } else
                ans = Math.max(ans, right-left + 1);
        }
        return ans;
    }
}
