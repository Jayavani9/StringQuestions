//https://leetcode.com/problems/longest-happy-string/description/

class Solution {
    public String longestDiverseString(int a, int b, int c) {
        //Tc: O(n) Sc: O(n) 
        int ac = 0;
        int bc = 0;
        int cc = 0;
        StringBuilder res = new StringBuilder();

        int start = 0;
        int end = a+b+c;

        while(start < end)
        {
            if(ac != 2 && a >= b && a >= c ||
            a > 0 && (bc == 2 || cc == 2))
            {
                res.append('a');
                ac++;
                a--;
                bc = 0;
                cc = 0;
            }

            else if(bc != 2 && b >= a && b >= c ||
            b > 0 && (ac == 2 || cc == 2))
            {
                res.append('b');
                bc++;
                b--;
                ac = 0;
                cc = 0;
            }

            else if(cc != 2 && c >= a && c >= b ||
            c > 0 && (bc == 2 || ac == 2))
            {
                res.append('c');
                cc++;
                c--;
                bc = 0;
                ac = 0;
            }
            start++;
        }
        return res.toString();
    }
}
