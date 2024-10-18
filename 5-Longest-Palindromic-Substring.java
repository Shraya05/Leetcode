class Solution {
    public String longestPalindrome(String s) {
        for(int len=s.length();len>0;len--)
        {
            for(int start=0;start<=s.length()-len;start++)
            {
                if(checkPalindrome(start,start+len,s))
                {
                    return s.substring(start,start+len);
                }
            }
        }
        return \\;
    }
    
    public boolean checkPalindrome(int i,int j,String s)
    {
        int left=i;
        int right=j-1;
        while(left<right)
        {
            if(s.charAt(left) != s.charAt(right))
            {
                return false;
            }
            
            left++;
            right--;
        }
        
        return true;
    }
}