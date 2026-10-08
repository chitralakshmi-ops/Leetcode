class Solution {
    public int shortestSubarray(int[] nums, int k) {
        int n=nums.length;
        //constructing the prefixsum array with n+1 size
        int [] pf=new int[n+1];
        for(int i=0;i<n;i++){
            pf[i+1]=pf[i]+nums[i];
        }
        int [] q=new int[n+1];
        int head=0;
        int tail=0;
        int ans=Integer.MAX_VALUE;
        //iterate on prefix
        for(int i=0;i<=n;i++){
            // if the subarray sum>=k then updating the length
            while(head<tail && pf[i]-pf[q[head]]>=k){
                ans=Math.min(ans,i-q[head]);
                head++;            
            }
            while(head<tail && pf[i]<=pf[q[tail-1]]){
                tail--;
            }
            q[tail++]=i;
        }
        return ans==Integer.MAX_VALUE ? -1:ans;
    }
}