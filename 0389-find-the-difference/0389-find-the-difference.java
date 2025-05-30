class Solution {
    public char findTheDifference(String s, String t) {
         int sum1=0;
         int sum2=0;
         for(char c:s.toCharArray())
         {
            sum1+=c;
         }
         for(char c:t.toCharArray())
         {
            sum2+=c;
         }
         int res=Math.abs(sum1-sum2);
         return (char)res;
    }
}