//https://leetcode.com/problems/sum-of-digits-of-string-after-convert/description/?envType=daily-question&envId=2024-09-03


class Solution {
    //Tc: O(n) Sc: O(1) 
    public int getLucky(String s, int k) {

        int num = 0;
        for(char ch: s.toCharArray())
        {
            int pos = ch-'a'+1;
            while(pos > 0)
            {
                num += pos%10;
                pos /= 10;
            }
        }
        
        for(int i = 1; i < k; i++){
            int sum = 0;
            while(num > 0)
            {
                sum += num%10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }
}


class Solution {
    public int getLucky(String s, int k) {
        //Tc: O(n)  Sc: O(n) 
        String ans = "";
        for(char ch: s.toCharArray())
        {
            ans += Integer.toString(ch - 'a' + 1);
        }

        while(k > 0)
        {
            int sum = 0;
            for(char dig: ans.toCharArray())
            {
                sum += dig - '0';
            }
            k--;
            ans = Integer.toString(sum);
        }

        return Integer.parseInt(ans);
    }
}
