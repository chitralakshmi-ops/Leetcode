int majorityElement(int* nums, int numsSize) {
    int count=0;
    int ele;
    for(int i=0;i<numsSize;i++){
        if(count==0){
            ele=nums[i];
        }
        if(ele==nums[i]){
            count++;
        }
        else{
            count--;
        }
    }
    return ele;
    
}