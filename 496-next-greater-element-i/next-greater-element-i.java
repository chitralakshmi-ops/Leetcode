class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Deque<Integer>st=new ArrayDeque<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums1.length;
        int m=nums2.length;
        for(int i=m-1;i>=0;i--)
        {
            int curr=nums2[i];
            while(!st.isEmpty() && curr>=st.peek())
            {
                st.pop();
            }
            if(st.isEmpty())
            {
                map.put(curr,-1);
            }
            else
            {
                map.put(curr,st.peek());
            }
            st.push(curr);
        }
        int res[]=new int[n];
        for(int i=0;i<n;i++)
        {
            res[i]=map.get(nums1[i]);
        }
        return res;
        
    }
}