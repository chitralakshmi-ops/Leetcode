class Solution {
    public int[] dailyTemperatures(int[] t) {
        int n=t.length;
        int ans[]=new int[n];
        ArrayDeque<Integer> st=new ArrayDeque<>();
        for(int i=n-1;i>=0;i--){
            int cur=t[i];
            while(!st.isEmpty() && cur>=t[st.peek()]){
                st.pop();
            }
            if(!st.isEmpty()){
                ans[i]=st.peek()-i;
            }
            else{
                ans[i]=0;
            }
            st.push(i);
        }
        return ans;
        
    }
}