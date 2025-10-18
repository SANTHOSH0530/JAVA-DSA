class Solution {
    public void sortColors(int[] nums) {
       int lb=0;
       int ub=nums.length-1;
       int mid=0;
       while(mid<=ub){
        if(nums[mid]==0){
            int temp=nums[lb];
            nums[lb++]=nums[mid];
            nums[mid++]=temp;
        }
        else if(nums[mid]==1){
            mid++;
        }
        else{
            int temp=nums[mid];
            nums[mid]=nums[ub];
            nums[ub--]=temp;
        }
       } 
    }
}
