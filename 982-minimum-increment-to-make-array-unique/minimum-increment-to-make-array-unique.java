class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                int increase = nums[i - 1] + 1 - nums[i];
                ans += increase;
                nums[i] += increase;
            }
        }
        return ans;
    }
}