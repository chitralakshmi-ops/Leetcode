class Solution {
    public int minSubarray(int[] nums, int p) {
        long totalsum=0;
        for(int num:nums){
            totalsum+=num;
        }
        int rem=(int)(totalsum%p);
        if(rem==0) return 0;
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,-1);
        long prefixsum=0;
        int minlength=nums.length;
        for(int i=0;i<nums.length;++i){
            prefixsum+=nums[i];
            int currentmod=(int)(prefixsum%p);
            int targetmod=(currentmod-rem+p)%p;
            if(map.containsKey(targetmod)){
                minlength=Math.min(minlength,i-map.get(targetmod));
            }
            map.put(currentmod,i);
        }
        return minlength==nums.length ? -1:minlength;

    }
}