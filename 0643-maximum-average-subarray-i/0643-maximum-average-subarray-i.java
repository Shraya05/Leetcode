class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int len=nums.length;
        double max=Integer.MIN_VALUE;
        double sum=0;
       for(int i=0;i<k;i++)
       {
           sum+=nums[i];
       }
        max=sum/k;
        for(int i=k;i<len;i++)
        {
            sum=sum+nums[i]-nums[i-k];
            max=Math.max(max,sum/k);
        }
        return max;
    }
}