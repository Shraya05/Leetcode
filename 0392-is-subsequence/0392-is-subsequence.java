class Solution {
    public boolean isSubsequence(String s, String t) {
        int n=s.length();
        int m=t.length();
        if(m<n) return false;
        int i=0,j=0;
        while(i<n && j<m)
        {
            if(s.charAt(i)==t.charAt(j))
            {
                i++;
            }
            j++;
        }
        if(i==n) return true;
       return false;
    }
}