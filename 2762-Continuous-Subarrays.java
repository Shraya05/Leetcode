class Solution {
    public long continuousSubarrays(int[] nums) {
        int n = nums.length;
        int left = 0;
        long count = 0;

        int minVal = nums[0], maxVal = nums[0];

        for (int right = 0; right < n; right++) {
            minVal = Math.min(minVal, nums[right]);
            maxVal = Math.max(maxVal, nums[right]);
            while (maxVal - minVal > 2) {
                left++;
                minVal = nums[left];
                maxVal = nums[left];
                for (int k = left; k <= right; k++) {
                    minVal = Math.min(minVal, nums[k]);
                    maxVal = Math.max(maxVal, nums[k]);
                }
            }
            count += (right - left + 1);
        }

        return count;
    }
}