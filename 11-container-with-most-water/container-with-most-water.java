class Solution {
    public int maxArea(int[] height) {
        int max_val=0;
        int area;
        int i=0;
        int j=height.length-1;
        while(i<j){
            area=Math.min(height[i],height[j])*(j-i);
            max_val=Math.max(area,max_val);
            if(height[i]<height[j])
            {
                i++;
            }
            else
            {
                j--;
            }
        }
        return max_val;
    }
}