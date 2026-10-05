class Solution {
    public boolean increasingTriplet(int[] nums) {
        int first=Integer.MAX_VALUE;
        int second=Integer.MAX_VALUE;
        for(int cur:nums){
            if(cur<=first){
                first=cur;
            }
            else if(cur<=second){
                second=cur;
            }
            else{
                return true;
            }
        }
        return false;
    }
}