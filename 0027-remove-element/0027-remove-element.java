class Solution {
    public int removeElement(int[] nums, int val) {
            int start=0;
            int end = nums.length-1;
            if(nums.length == 1){
                if(val == nums[0]){
                    return 0;
                }
                return nums[0];
            }
            while(start<=end){
                if(nums[end]== val){
                    end--;
                }
                else if(nums[start] == val){
                    int temp = nums[start];
                    nums[start] = nums[end];
                    nums[end] = temp;
                    
                }else{
                start++;
                }
            }
        return start;
        
    }
}