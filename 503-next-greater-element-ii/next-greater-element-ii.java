class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        Arrays.fill(ans,-1);
        Deque<Integer>st=new ArrayDeque<>();
        for(int i=0;i<2*n;i++){
            int cur=nums[i%n];
            while(!st.isEmpty() && cur>nums[st.peek()]){
                ans[st.pop()]=cur;
            }
            if(i<n){
                st.push(i);
            }
        }
        return ans;
    }
}