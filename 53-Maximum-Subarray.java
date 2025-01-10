class Solution {
    public int maxSubArray(int[] nums) {
        int global=Integer.MIN_VALUE;
        int sum=0;
       for(int i=0;i<nums.length;i++)
       {
        sum=Math.max(nums[i],sum+nums[i]);
        global=Math.max(global,sum);
       } 
       return global;
    }
}