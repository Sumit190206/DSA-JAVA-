class Solution {
    public int arrayNesting(int[] nums) {
        int max = 0;
        boolean[] isRepeat = new boolean[nums.length];
        for (int start = 0; start < nums.length; start++) {
            if (isRepeat[start]) {
                continue;
            }
            int count = 0;
            int i = start;
            while (!isRepeat[i]) {
                count++;
                isRepeat[i] = true;
                i = nums[i];
            }
            max = Math.max(max, count);
        }
        return max;
    }
}