class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        int maxjump=0;
        int i=0;
        while(i<=n-1){
            if(i>maxjump){
                return false;
            }
            maxjump=Math.max(maxjump,i+nums[i]);
            i++;
        }
        return true;
    }
}