#https://leetcode.com/problems/compare-version-numbers/description/

class Solution:
    def compareVersion(self, version1: str, version2: str) -> int:
        #Tc: O(m+n)) Sc: O(m+n) 
        v1 = version1.split(".")
        v2 = version2.split(".")

        v1Len = len(v1)
        v2Len = len(v2)

        maxLen = max(v1Len, v2Len)

        for i in range(maxLen):
            if i < v1Len:
                num1 = int(v1[i])
            else:
                num1 = 0

            if i < v2Len:
                num2 = int(v2[i])
            else: 
                num2 = 0

            
            if num1 != num2:
                if num1 > num2:
                    return 1
                else:
                    return -1
        return 0

            
        
