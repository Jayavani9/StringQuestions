//https://leetcode.com/problems/shortest-word-distance/

class Solution {
    public int shortestDistance(String[] wordsDict, String word1, String word2) {
         //Tc: O(n) Sc: O(1)
         int p1 = -1;
         int p2 = -1;
         int ans = Integer.MAX_VALUE;
         int n = wordsDict.length;
         for(int i = 0; i < n; i++)
         {
            String word = wordsDict[i];
            if(word.equals(word1) )
            {
                p1 = i;
            }
            if(word.equals(word2))
            {
                p2 = i;
            }
            if(p1 != -1 && p2 != -1)
            {
                ans = Math.min(ans, Math.abs(p2-p1));
            }
         }
            return ans;
    }
}
