class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int longest=0;
        for(int a:set){
            if(!set.contains(a-1)){
                int count=1;
                while(set.contains(a+1)){
                    a++;
                    count++;
                }
                longest=Math.max(longest,count);
            }
        }
        return longest;
    }
}