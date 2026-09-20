class Solution {
    public void nextPermutation(int[] nums) {
        int i=nums.length-2;
        //find pivot value from right
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        //find greater number than the pivot value from right 
        if(i>=0){
            int j=nums.length-1;
            while(nums[j]<=nums[i]){
                j--;
            }
            //swap the pivot value with the larger number 
            int t=nums[i];
            nums[i]=nums[j];
            nums[j]=t;
        }
        //reverse all the elements immediate next to the swapped new number
        int left=i+1;
        int right=nums.length-1;
        while(left<right){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
    }
}