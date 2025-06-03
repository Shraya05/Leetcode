class Solution {
    public int longestPalindromeSubseq(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--)
        {
            sb.append(s.charAt(i));
        }
        int len=lcs(s,sb.toString());
        return len;
    }
    public static int lcs(String s1,String s2)
    {
        int dp[][]=new int[s1.length()+1][s2.length()+1];
        for(int i=0;i<=s1.length();i++)
        {
            for(int j=0;j<=s2.length();j++)
            {
                if(i==0 || j==0) dp[i][j]=0;
               else if(s1.charAt(i-1)==s2.charAt(j-1))
                {
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else
                {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[s1.length()][s2.length()];
    }
}