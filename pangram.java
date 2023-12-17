1832. Check if the Sentence Is Pangram

A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.


Example 1:

Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.
Example 2:

Input: sentence = "leetcode"
Output: false

class Solution {
    //Tc: O(n) Sc: O(1)
    public boolean checkIfPangram(String sentence) {
        char[] check = new char[26];
        for(int i = 0 ; i < sentence.length(); i++)
        {
            char ch = sentence.charAt(i);
            check[ch - 'a']++;
        }        
        for(int i = 0 ; i < check.length; i++)
        {
            if(check[i] < 1) return false;
        }
        return true;
    }
}

class Solution {
    //Tc: O(n) Sc: O(1)
    public boolean checkIfPangram(String sentence) {
        for(int i = 0 ; i < 26; i++)
        {
            char cur = (char) ('a' + i);
            if(sentence.indexOf(cur) == -1) return false;
        }
        return true;
    }
}
