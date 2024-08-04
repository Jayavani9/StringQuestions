//https://leetcode.com/problems/break-a-palindrome/


class Solution {
    public String breakPalindrome(String palindrome) {
        //Tc: O(n) Sc: O(n) 
        int n = palindrome.length();

        if(n == 1) return "";

        char[] letters = palindrome.toCharArray();
        for(int i = 0; i < n/2; i++)
        {
            if(letters[i] != 'a') 
            {
                letters[i] = 'a';
                return String.valueOf(letters);
            }
        }
        letters[n-1] = 'b';
        return String.valueOf(letters);
    }
}
