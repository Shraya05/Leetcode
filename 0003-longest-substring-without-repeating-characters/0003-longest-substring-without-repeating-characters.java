class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int len=s.length();
        int left=0;
        int maxlen=0;
        for(int right=0;right<len;right++)
        {
            char curr=s.charAt(right);
            if(!(set.contains(curr)))
               {
                   set.add(curr);
                   maxlen=Math.max(maxlen,right-left+1);
               } 
               else
               {
                   while(set.contains(curr))
                   {
                       set.remove(s.charAt(left));
                       left++;
                   }
                   set.add(curr);
               }
        }
               return maxlen;
    }
}