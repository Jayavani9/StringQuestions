2259. Remove Digit From Number to Maximize Result

class Solution:
    def removeDigit(self, number: str, digit: str) -> str:
        n = len(number)
        res = ""
        for i in range(n):
            if number[i] == digit:
                if i < n-1 and number[i] < number[i+1]:
                    res = number[:i] + number[i+1:]
                    return res
                res =  number[:i] + number[i+1:]
        return res
