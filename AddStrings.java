//https://leetcode.com/problems/add-strings/

class Solution {
    public String addStrings(String num1, String num2) {
        //Tc: O(n)  Sc: O(1)
        int l1 = num1.length() - 1;
        int l2 = num2.length() - 1;
        int carry = 0;
        StringBuilder ans = new StringBuilder();
        
        while (l1 >= 0 || l2 >= 0 || carry != 0) {
            int p1,p2;
            if(l1 >= 0)
            {
                p1 = num1.charAt(l1) -'0';
            }
            else p1 = 0;
            if (l2 >= 0)
            {
                p2 = num2.charAt(l2) - '0';
            }
            else p2 = 0;

            int sum = p1 + p2 + carry;
            ans.append(sum % 10);
            carry = sum / 10;
            l1--;
            l2--;
        }
        
        return ans.reverse().toString();
    }
}
