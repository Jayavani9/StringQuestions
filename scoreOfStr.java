//https://leetcode.com/problems/score-of-a-string/description

class Solution {
    public int scoreOfString(String s) {
        //Tc: O(n) Sc: O(1)
        int ans = 0;
        for(int i = 0; i < s.length()-1; i++)
        {
            ans += Math.abs(s.charAt(i) - s.charAt(i+1));
        }
        return ans;
    }
}



