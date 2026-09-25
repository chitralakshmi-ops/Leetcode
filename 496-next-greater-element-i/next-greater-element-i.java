class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans=new int[nums1.length];
        for(int i=0;i<nums1.length;i++) {
            int pos=-1;
            // Find nums1[i] in nums2
            for(int k=0;k<nums2.length;k++) {
                if(nums2[k]==nums1[i]){
                    pos=k;
                    break;
                }
            }
            int flag=0;
            // Search for next greater element to the right
            for(int j=pos+1;j<nums2.length;j++) {
                if(nums2[j]>nums1[i]){
                    ans[i]=nums2[j];
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                ans[i]=-1;
            }
        }
        return ans;
    }
}