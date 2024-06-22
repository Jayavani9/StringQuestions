
#https://www.geeksforgeeks.org/problems/validate-an-ip-address-1587115621/1

#User function Template for python3

def isValid(s):
    #code here
    #Tc: O(n) Sc: O(n) ~ O(1)
    address = s.split(".")
    
    if len(address) != 4:
        return 0
        
    for i in address:
        if not i.isdigit() or (len(i) > 1 and i[0] == '0'):
            return 0
        
    
        num = int(i)
        
        if num < 0 or num > 255:
            return 0
    return 1



#{ 
 # Driver Code Starts
#Initial Template for Python 3

    
if __name__=="__main__":
    t=int(input())
    for _ in range(0,t):
        s=input()
        if(isValid(s)):
            print(1)
        else:
            print(0)
    

# } Driver Code Ends
