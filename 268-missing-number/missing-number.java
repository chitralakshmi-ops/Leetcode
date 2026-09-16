class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int actual=0;
        int expected=n*(n+1)/2;
        for(int num:nums){
            actual+=num;
        }
        return expected-actual;
        
    }
}