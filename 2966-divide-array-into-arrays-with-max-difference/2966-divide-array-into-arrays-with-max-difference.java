class Solution {
    public int[][] divideArray(int[] nums, int k) {
  Arrays.sort(nums);
   List<int[]> ans=new ArrayList<>();
   for(int i=0;i<nums.length;i+=3)
   {
    int a=nums[i];
    int b=nums[i+1];
    int c=nums[i+2];
    if(c-a >k) return new int[0][];
    ans.add(new int[]{a,b,c});
   }
   return ans.toArray(new int[ans.size()][]);
    }

}