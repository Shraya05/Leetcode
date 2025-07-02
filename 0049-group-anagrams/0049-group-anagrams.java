class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        for(String s:strs)
        {
            char ch[]=s.toCharArray();
            Arrays.sort(ch);
            String temp=String.valueOf(ch);
            if(!map.containsKey(temp))
            {
                map.put(temp,new ArrayList<>());
            }
            map.get(temp).add(s);
        }
        return new ArrayList<>(map.values());
    }
}