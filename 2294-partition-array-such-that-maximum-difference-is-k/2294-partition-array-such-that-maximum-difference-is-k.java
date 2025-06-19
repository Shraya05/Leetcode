class Solution {
    public int partitionArray(int[] nums, int k) {
        int count=0;
        int n=nums.length;
        int j=1,i=0;
        Arrays.sort(nums);
        while(i<n && j<n)
        {
            if(nums[j]-nums[i]>k)
            {
                count++;
                i=j;
                j++;
            }
            else j++;
        }
        return count+1;
    }
}