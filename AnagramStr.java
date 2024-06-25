//https://www.geeksforgeeks.org/problems/anagram-of-string/1

class GfG
{
	public int remAnagrams(String s,String s1)
        {
        //add code here.
        //Tc: O(m+n) Sc: O(1)
        int cnt = 0;
        
        int n = s.length();
        int n1 = s1.length();
        char[] cs = new char[s.length()];
        char[] cs1 = new char[s1.length()];
        
        for(int i = 0; i < n; i++)
        {
            cs[s.charAt[i]-'a']++;
        }
        
        for(int j = 0; j < n1; j++)
        {
             cs1[s1.charAt[j]-'a']++;
        }
        
        for(int i = 0; i < 26; i++)
        {
            cnt += Math.abs(cs[i] - cs1[i]);
        }
        return cnt;
        }
}
