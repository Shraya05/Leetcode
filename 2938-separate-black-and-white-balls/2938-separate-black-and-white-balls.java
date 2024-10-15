class Solution {
    public long minimumSteps(String s) {
        long result=0;
        int seen=0;
        for(int i=0;i<s.length();i++)
        {
            char curr=s.charAt(i);
            if(curr=='0')
            {
                result+=seen;
            }
            else
            {
                seen++;
            }
        }
        return result;
    }
}