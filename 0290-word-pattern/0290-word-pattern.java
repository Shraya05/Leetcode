class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character,String> map=new HashMap<>();
        Set<String> set=new HashSet<>();
        String str[]=s.split(" ");
         if(pattern.length()!=str.length) return false;
     for(int i=0;i<pattern.length();i++)
     {
        char c=pattern.charAt(i);
        String word=str[i];
        if(map.containsKey(c))
        {
            if(!map.get(c).equals(word)) return false;
        }
        else
        {
            if(set.contains(word)) return false;
            map.put(c,word);
            set.add(word);
        }
     }
     return true;
    }
}