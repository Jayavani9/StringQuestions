242. Valid Anagram

Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, 
typically using all the original letters exactly once.

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false

//1. Using Sorting 
class Solution {
    //Tc: O(nlogn)  Sc: O(1)
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        /*
        char s1[] = s.toCharArray();
        char s2[] = t.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(s2);

        return Arrays.equals(s1,s2);
        }
}

2. Using a counter Array
class Solution {
    // Tc: O(n)   Sc: O(1) as it O(26) n here it 26 and can be considered constant
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int cntr[] = new int[26];
        for(int i = 0 ; i < s.length(); i++)
        {
            cntr[s.charAt(i) - 'a']++;
            cntr[t.charAt(i) - 'a']--;
        }

        for(int c:cntr){
            if(c != 0) return false;
        }
        return true;
        
    }
}
