class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap<>(); 
        mp.put(0, 1);

        int preSum = 0, cnt = 0;
        for (int num : nums) {
            preSum += num;
            if (mp.containsKey(preSum - k)) {
                cnt += mp.get(preSum - k);
            }
            mp.put(preSum, mp.getOrDefault(preSum, 0) + 1);
        }
        return cnt;
    }
}