class Solution {
    public int getLucky(String s, int k) {
              StringBuilder sb = new StringBuilder();
              for(char c:s.toCharArray())
              {
                int val=c-'a'+1;
                sb.append(val);
              }

      String str=sb.toString();
      int sum=0;
      while(k-- >0)
      {
        sum=0;
        for(char c:str.toCharArray())
        {
            sum+=c-'0';
        }
        str=String.valueOf(sum);
      }
return sum;
    }
}