class Solution {
    public int[] getConcatenation(int[] nums) {
        int arr[]=new int[nums.length*2];
        for(int i=0;i<nums.length;i++)
        {
            arr[i]=nums[i];
        }
   for(int i=nums.length,ind=0;i<nums.length*2;i++,ind++)
   {
    arr[i]=nums[ind];
   }
      return arr;  
    }
}