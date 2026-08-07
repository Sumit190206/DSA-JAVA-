
class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
         for (int i = 0, j = nums.length - 1; i < j; i++, j--) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
       int max=Integer.MIN_VALUE;
       int final_max =Integer.MIN_VALUE;
       int count=0;
       for(int i=0;i<nums.length;i++){
        if(max == nums[i]){
            continue;
        }
        else{
            max = nums[i];
            count++;
        }
        final_max = Math.max(final_max,max);
        if(count == 3){
            return max;
        }
       } 
       return final_max;
    }
}