class Solution {
    public char findTheDifference(String s, String t) {
         int xor1=0;
         for(char c:s.toCharArray())
{
    xor1^=c;
}
for(char c:t.toCharArray())
{
    xor1^=c;
}
return (char)xor1;
    }
}