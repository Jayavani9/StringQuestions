#https://leetcode.com/problems/find-the-closest-palindrome/

//TLE Solution 
class Solution:
    def isPalin(self, num):
        return str(num) == str(num)[::-1]

    def nearestPalindromic(self, n: str) -> str:
        num = int(n)
        low = num-1
        up = num+1

        while True:
            if self.isPalin(low):
                break
            low = low-1

        while True:
            if self.isPalin(up):
                break
            up = up+1

        if abs(num-low) <= abs(up-num):
            return str(low)
        else:
            return str(up)
        

