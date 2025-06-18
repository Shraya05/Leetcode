class Solution {
    public int[] singleNumber(int[] nums) {
        int arr[]=new int[2];
        Set<Integer> set=new HashSet<>();
        for(int n:nums)
        {
            if(set.contains(n)) set.remove(n);
            else set.add(n);
        }
        int i=0;
        for(int j:set)
        {
            arr[i++]=j;
        }
        return arr;
    }
}