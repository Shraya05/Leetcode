class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> map= new HashMap<>();
        for(int val:nums)
        {
            map.put(val,map.getOrDefault(val,0)+1);
        }

        int max=Integer.MIN_VALUE;
        for(int i:map.values())
        {
            max=Math.max(max,i);
        }
        int key=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            if(entry.getValue()==max)
            {
                key=Math.max(key,entry.getKey());
            }
        }
        return key*max;
    }
}