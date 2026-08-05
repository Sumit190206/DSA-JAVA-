class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length == 1){
            return true;
        }
         int max = 0;
         int furthest = 0;
        for(int i=0;i<nums.length;i++){
            if(i > furthest){
                return false;
            }
            furthest = Math.max(furthest,(nums[i]+i));
             if(furthest >= nums.length-1){
                return true;
             }
            }
       
        return true;

    }
}