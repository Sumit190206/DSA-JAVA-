class Solution {
    public boolean divideArray(int[] nums) {
        if(nums.length % 2 != 0){
            return false;
        }
        Arrays.sort(nums);
        int n = nums.length/2;
        boolean result = true;
        int left=0;
        int right = 1;
        for(int i=0;i<n;i++){
            if(nums[left] != nums[right]){
                return false;
            }
            left+=2;
            right+=2;
        }
        return true;
    }
}