2384. Largest Palindromic Number

You are given a string num consisting of digits only.

Return the largest palindromic integer (in the form of a string) that can be formed using digits taken from num. It should not contain leading zeroes.

Notes:

You do not need to use all the digits of num, but you must use at least one digit.
The digits can be reordered.
 

Example 1:

Input: num = "444947137"
Output: "7449447"
Explanation: 
Use the digits "4449477" from "444947137" to form the palindromic integer "7449447".
It can be shown that "7449447" is the largest palindromic integer that can be formed.
Example 2:

Input: num = "00009"
Output: "9"
Explanation: 
It can be shown that "9" is the largest palindromic integer that can be formed.
Note that the integer returned should not contain leading zeroes.


class Solution {
    public String largestPalindromic(String num) {
        //Tc: O(n) Sc: O(n)
        HashMap<Integer, Integer> map = new HashMap<>();
        StringBuilder left = new StringBuilder();
        StringBuilder middle = new StringBuilder();
        for(char ch: num.toCharArray())
        {
            int i = ch - '0';
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        
        if (map.size() == 1 && map.containsKey(0)) {
            return "0";
        }

        for(int dig = 9; dig >= 0; dig--)
        {
            if(dig == 0 && left.length() == 0) break;
            if(map.containsKey(dig))
            {
                int cnt = map.get(dig);
                for(int i = 0 ; i < cnt/2; i++)
                {
                    left.append(dig);
                }

                if(cnt%2 != 0 && middle.length() == 0) middle.append(dig);
            }
        }
        
        StringBuilder right = new StringBuilder(left);
        left.append(middle);
        right.reverse();
        left.append(right);
        String res = left.toString();
        /*
        int cnt = 0;
        for(int i = 0; i < res.length(); i++)
        {
            char ch = res.charAt(i);
            if(ch - '0' == 0) cnt++;
        }
        if(cnt == res.length()) return "0";
        */
        return res;

    }
}
