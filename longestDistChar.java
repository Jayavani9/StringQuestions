//https://www.geeksforgeeks.org/problems/longest-distinct-characters-in-string5848/1


class Solution{
    static int longestSubstrDistinctChars(String S){
        // code here
        //Tc: O(n) Sc: O(n)
        int start = 0;
        int end = 0;
        HashSet<Character> set = new HashSet<>();
        int cnt = 0;
        
        while(end < S.length())
        {
            if(set.contains(S.charAt(end)))
            {
                set.remove(S.charAt(start));
                start++;
            }
            else
            {
                set.add(S.charAt(end));
                end++;
                cnt = Math.max(cnt, end-start);
            }
        }
        return cnt;
    }
}
