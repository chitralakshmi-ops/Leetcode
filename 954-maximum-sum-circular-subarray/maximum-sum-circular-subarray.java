class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int currmax=0;
        int currmin=0;
        int tot=0;
        int maxs=Integer.MIN_VALUE;
        int mins=Integer.MAX_VALUE;
        for(int curr:nums){
            currmax=Math.max(curr+currmax,curr);
            maxs=Math.max(maxs,currmax);
            currmin=Math.min(curr+currmin,curr);
            mins=Math.min(mins,currmin);
            tot+=curr;
        }
        if(maxs<0){
            return maxs;
        }
        return Math.max(maxs,tot-mins);



    }
}