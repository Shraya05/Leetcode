class Solution {
    public int scoreOfString(String s) {
        int sum=0,j=1;
       for(int i=0;i<s.length()-1 && j<s.length();i++)
       {
        sum+=Math.abs(s.charAt(i)-s.charAt(j));
        j++;
       } 
       return sum;
    }
}