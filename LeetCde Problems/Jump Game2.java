class Solution {
    public int jump(int[] nums) {
        int jump=0;
        int curend=0;
        int maxjump=0;
        for(int i=0;i<nums.length-1;i++){
            maxjump=Math.max(maxjump,i+nums[i]);
            if(curend==i){
                jump++;
                curend=maxjump;
            }
        }
        return jump;
    }
}
