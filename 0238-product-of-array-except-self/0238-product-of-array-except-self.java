class Solution {
    public int[] productExceptSelf(int[] nums) {
        int count=0;
        int n=nums.length;
        int sum=1;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==0)
            count++;
            else
            sum*=nums[i];
        }
        int ans[]=new int[n];
        for(int i=0;i<n;i++)
        {
            if(count>1)ans[i]=0;
            else
            {
                if(nums[i]==0)
                ans[i]=sum;
                else
                {
                    if(count==1)
                    ans[i]=0;
                    else
                    ans[i]=sum/nums[i];
                }
            }
        }
        return ans;
    }
}