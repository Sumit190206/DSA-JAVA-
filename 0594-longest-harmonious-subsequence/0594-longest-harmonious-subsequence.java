class Solution {
    public int findLHS(int[] nums) {
     Arrays.sort(nums);
     int count =0;
     int max = 0;
     int left=0;
     int right = 1;
     while(right < nums.length){
        if(nums[right] == nums[left]+1 || nums[right] == nums[left]){
            right++;


              if (nums[right - 1] == nums[left] + 1) {
                    count = right - left;
                    max = Math.max(max, count);
                }
        }

       
        else{
            left++;
            right = left + 1;
        }
     }
     return max;
    }
}