//https://leetcode.com/problems/reverse-prefix-of-word/description/

class Solution {
    //Tc: O(n) Sc: O(n) 
    public String reversePrefix(String word, char ch) {
        for(int i = 0; i < word.length(); i++)
        {
            if(word.charAt(i) == ch)
            {
                return rev(0, i, word);
            }
           
        }
         return word;
    }

    private String rev(int st, int end, String word)
    {
        char[] wordChar = word.toCharArray();
        while(st < end)
        {
            char temp = wordChar[st];
            wordChar[st] = wordChar[end];
            wordChar[end] = temp;
            st++;
            end--;
        }
        return new String(wordChar);
    }
}
