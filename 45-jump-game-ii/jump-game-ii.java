class Solution {
    public int jump(int[] nums) {
        int i = 0;
        int maxjump = 0;
        int step = 0;

        while(maxjump < nums.length - 1) {
            int far = maxjump;
            for(int j = i; j <= maxjump; j++) {
                far = Math.max(far, j + nums[j]);
            }
            i = maxjump + 1;
            maxjump = far;
            step++;
        }

        return step;
    }
}