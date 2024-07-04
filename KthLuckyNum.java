//https://leetcode.com/problems/find-the-k-th-lucky-number/

//TLE Solution 
class Solution {
    public String kthLuckyNumber(int k) {
        Queue<String> q = new LinkedList<>();

        q.add("4");
        q.add("7");
        
        int cnt = 0;

        while(!q.isEmpty())
        {
            String cur = q.poll();
            cnt++;

            if(cnt == k) return cur;

            q.add(cur+"4");
            q.add(cur+"7");
        }
        return "";
    }
}
