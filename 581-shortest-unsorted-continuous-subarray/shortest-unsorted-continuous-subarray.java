class Solution {
    public int findUnsortedSubarray(int[] nums) {

        int left = -1;
        int right = -1;

        // Find basic range
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {

                if (left == -1)
                    left = i;

                right = i + 1;
            }
        }

        // Already sorted
        if (left == -1)
            return 0;

        // Find min and max
        int min = nums[left];
        int max = nums[left];

        for (int i = left; i <= right; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }

        // Expand left
        while (left > 0 && nums[left - 1] > min) {
            left--;
        }

        // Expand right
        while (right < nums.length - 1 && nums[right + 1] < max) {
            right++;
        }

        return right - left + 1;
    }
}