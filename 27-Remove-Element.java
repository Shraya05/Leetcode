class Solution {
    public int removeElement(int[] nums, int val) {
        int index=0;
           for(int i=0;i<nums.length;i++)
           {
            if(nums[i]==val)
            {
                index=i;
                break;
            }
           }
            int i=index;
            int j=index;
            while(j<nums.length)
            {
                if(nums[j]!=val)
                {
                    nums[i++]=nums[j];
                }
                 j++;
            }
             
           return i;
    }
}