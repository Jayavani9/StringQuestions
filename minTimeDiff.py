#https://leetcode.com/problems/minimum-time-difference/description

class Solution:
    #Tc: O(nlogn) Sc: O(n) 
    def findMinDifference(self, timePoints: List[str]) -> int:
        def convToMins(time):
            hrs, mins = map(int, time.split(":"))
            return hrs*60+mins

        mins = list(convToMins(time) for time in timePoints)

        mins.sort()

        ans = float('inf')

        for i in range(1, len(mins)):
            ans = min(ans, mins[i]-mins[i-1])

        antiDiff = 1440 - mins[-1] + mins[0]
        return min(ans, antiDiff)
        
