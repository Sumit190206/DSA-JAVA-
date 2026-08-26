class Solution {
    public int missingMultiple(int[] nums, int k) {
        int m=1;
        int num = k * m ;

        for(int i=0;i<nums.length;i++){
            if(nums[i] == num){
                m++;
                num = k*m;
                i=-1;
            }
            else if(i == nums.length-1){
                return num;
            }
        }
        return num;
    }
}