#https://leetcode.com/problems/largest-number/description

class Solution:
    def largestNumber(self, nums: List[int]) -> str:
        # Tc: O(nlogn) Sc: O(n*k)
        strNums = list(map(str, nums))

        strNums.sort(key = lambda x: x*10, reverse = True)

        ans = "".join(strNums)

        if strNums[0] == '0':
            return '0'

        return ans

        

