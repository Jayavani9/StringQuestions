//https://leetcode.com/problems/is-subsequence/

class Solution {
    public boolean isSubsequence(String s, String t) {
        //Tc: O(n) Sc: O(1) 
        int j = 0;
        for(int i = 0; i < t.length() && j < s.length(); i++)
        {
            if(s.charAt(i) == t.charAt(i)) 
            {
                j++;
            }
        }
        return j == s.length();
    }
}

