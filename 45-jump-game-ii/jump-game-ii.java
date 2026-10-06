class Solution {
    public int jump(int[] nums) {
        int prev = 0;
        int maxjump = 0;
        int step = 0;
        for(int i=0;i<nums.length-1;i++){
            maxjump=Math.max(maxjump,i+nums[i]);
            if(i==prev){
                step+=1;
                prev=maxjump;
            }
        }
        return step;
    }
}