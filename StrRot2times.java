//https://www.geeksforgeeks.org/problems/check-if-string-is-rotated-by-two-places-1587115620/1?page=1&category%5B%5D=Strings&sortBy=

class Solution
{
    //Function to check if a string can be obtained by rotating
    //another string by exactly 2 places.
    public static boolean isRotated(String str1, String str2)
    {
        // Your code here
        //Tc: O(n)  Sc: O(1)
        int n1 = str1.length();
        int n2 = str2.length();
        
        if(n1 == 1 && n2 == 1) return false;
        
        if(n1 != n2) return false;
        
        String clk = str1.substring(n1-2) + str1.substring(0,n1-2);
        String antiClk = str1.substring(2) + str1.substring(0,2);
        
        return str2.equals(clk) || str2.equals(antiClk);
    }
    
}
