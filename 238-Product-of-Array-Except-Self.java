class Solution {
    public int[] productExceptSelf(int[] nums) {
        int left=1;
        int right=1;
        int result[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
             result[i]=left;
             left*=nums[i];
        }
        for(int j=nums.length-1;j>=0;j--)
        {
            result[j]*=right;
            right*=nums[j];
        }
        return result;
    }
}