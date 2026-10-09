class Solution {
    public static void swap(int i,int j,int[] nums){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public static void solve(int idx,int[] nums,List<List<Integer>>res){
        //base case
        if(idx==nums.length){
            List<Integer>ds=new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                ds.add(nums[i]);
            }
            res.add(new ArrayList<>(ds));
            return;
        }
        for(int i=idx;i<nums.length;i++){
            swap(idx,i,nums);
            //recursive step
            solve(idx+1,nums,res);
            //backtrack
            swap(idx,i,nums);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>res=new ArrayList<>();
        solve(0,nums,res);
        return res;

    }
}